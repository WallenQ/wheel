package com.wallen.wheel.event.listen;

import com.wallen.wheel.event.event.NoticeEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 消息通知监听-基于注解
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-01-02
 */
@Component
public class NoticeListener2 {

    private static final Logger logger = LoggerFactory.getLogger(NoticeListener2.class);

    /**
     * 条件方式过滤监听的事件
     */
    @Async
    @EventListener(value = {NoticeEvent.class}, condition = "#noticeEvent.message == 'my-event'")
    public void onApplicationEvent(NoticeEvent noticeEvent) {
        logger.info("Listener receive event message is : {}", noticeEvent.getMessage());
    }
}
