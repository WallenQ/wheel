package com.wallen.disruptor.service;

/**
 * @author wallen
 * @date 2023/10/23 16:40
 */
public interface DisruptorMqService {
    /**
     * 消息
     *
     * @param message
     */
    void sayHelloMq(String message);
}
