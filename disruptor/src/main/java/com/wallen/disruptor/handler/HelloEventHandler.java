package com.wallen.disruptor.handler;

import com.lmax.disruptor.EventHandler;
import com.wallen.disruptor.model.MessageModel;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wallen
 * @date 2023/10/23 16:03
 */
@Slf4j
public class HelloEventHandler implements EventHandler<MessageModel> {
    @Override
    public void onEvent(MessageModel messageModel, long l, boolean b) throws Exception {
        try {
            //这里停止1000ms是为了确定消费消息是异步的
            Thread.sleep(1000);
            log.info("消费者处理消息开始");
            if (messageModel != null) {
                log.info("消费者处理的消息是：{}", messageModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("消费者处理消息失败");
        }
        log.info("消费者处理消息结束");
    }
}
