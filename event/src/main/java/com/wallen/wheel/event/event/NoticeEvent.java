package com.wallen.wheel.event.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;

/**
 * 消息通知事件
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-01-02
 */
public class NoticeEvent extends ApplicationEvent {

    private static final Logger logger = LoggerFactory.getLogger(NoticeEvent.class);

    /**
     * 接受信息
     */
    private String message;

    public NoticeEvent(String message) {
        super(message);
        this.message = message;
        logger.info("add event success! message: {}", message);
    }

    public String getMessage() {
        return message;
    }
}
