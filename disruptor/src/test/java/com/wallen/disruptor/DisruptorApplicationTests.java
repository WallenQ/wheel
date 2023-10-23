package com.wallen.disruptor;

import com.wallen.disruptor.service.DisruptorMqService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class DisruptorApplicationTests {
    @Autowired
    private DisruptorMqService disruptorMqService;

    @Test
    void contextLoads() throws Exception{
        disruptorMqService.sayHelloMq("消息到了，Hello world!");
        log.info("消息队列已经发送完毕");
        //这里停止1000ms是为了确定消费消息是异步的
        Thread.sleep(1000);
    }

}
