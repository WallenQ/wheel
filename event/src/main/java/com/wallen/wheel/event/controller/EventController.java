package com.wallen.wheel.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wallen.wheel.event.event.NoticeEvent;

/**
 * 测试方法入口
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-01-02
 */
@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping("/notice/{message}")
    public void notice(@PathVariable(name = "message") String message) {
        applicationEventPublisher.publishEvent(new NoticeEvent(message));
    }
}
