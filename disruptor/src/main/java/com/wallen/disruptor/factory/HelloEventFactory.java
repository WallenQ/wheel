package com.wallen.disruptor.factory;

import com.lmax.disruptor.EventFactory;
import com.wallen.disruptor.model.MessageModel;

/**
 * @author wallen
 * @date 2023/10/23 16:02
 */
public class HelloEventFactory implements EventFactory<MessageModel> {
    @Override
    public MessageModel newInstance() {
        return new MessageModel();
    }
}
