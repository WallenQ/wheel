package com.wallen.wheel.event.listen;

import com.wallen.wheel.event.event.NoticeEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 消息通知监听-实现监听接口方式
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-01-02
 */
@Component
public class NoticeListener implements ApplicationListener<NoticeEvent> {

    private static final Logger logger = LoggerFactory.getLogger(NoticeListener.class);

    /**
     * 注解 @Async 表明改方法使用异步执行
     */
    @Async
    @Override
    public void onApplicationEvent(NoticeEvent noticeEvent) {
        logger.info("Listener receive event message is : {}", noticeEvent.getMessage());
    }
}
