package com.wallen.wheel.event.listen;

import com.wallen.wheel.event.event.NoticeEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 消息通知监听-注解方式
 *
 * @author wallen
 * @date 2022/7/14 11:47
 */
@Component
public class NoticeAnnotation {

    private static final Logger logger = LoggerFactory.getLogger(NoticeAnnotation.class);

    @EventListener(classes = {NoticeEvent.class})
    public void listener(NoticeEvent noticeEvent) {
        logger.info("Annotation receive event message is : {}", noticeEvent.getMessage());
    }
}
