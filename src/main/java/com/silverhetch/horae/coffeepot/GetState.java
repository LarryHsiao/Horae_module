package com.silverhetch.horae.coffeepot;

import com.silverhetch.horae.Message;

public class GetState implements Message {
    @Override
    public String messageType() {
        return Const.MESSAGE_TYPE;
    }

    @Override
    public String content() {
        return Const.CONTROL_STATE;
    }
}
