package com.wallen.disruptor.manager;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import com.wallen.disruptor.factory.HelloEventFactory;
import com.wallen.disruptor.handler.HelloEventHandler;
import com.wallen.disruptor.model.MessageModel;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wallen
 * @date 2023/10/23 16:12
 */
@Component
public class MQManager {

    @Bean("messageModel")
    public RingBuffer<MessageModel> messageModelRingBuffer() {
        //定义用于事件处理的线程池 Disruptor通过java.util.concurrent.ExecutorService提供的线程来触发consumer的事件处理
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //指定事件工厂
        HelloEventFactory factory = new HelloEventFactory();

        //指定ring buffer字节大小，必须为2的N次方（能将求模运算转为位运算提高效率），否则将影响效率
        int bufferSize = 1024 * 256;

        //单线程模式，获取额外的性能
        Disruptor<MessageModel> disruptor = new Disruptor<MessageModel>(factory, bufferSize, executorService, ProducerType.SINGLE, new BlockingWaitStrategy());

        //设置事件业务处理器---消费者
        disruptor.handleEventsWith(new HelloEventHandler());

        //启动disruptor线程
        disruptor.start();

        //获取ring buffer 环，用于接取生产者的事件
        return disruptor.getRingBuffer();
    }
}