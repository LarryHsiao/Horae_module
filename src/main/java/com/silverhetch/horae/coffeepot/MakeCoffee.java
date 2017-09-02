package com.silverhetch.horae.coffeepot;

import com.silverhetch.horae.Message;

import static com.silverhetch.horae.coffeepot.Const.CONTROL_MAKE_COFFEE;
import static com.silverhetch.horae.coffeepot.Const.MESSAGE_TYPE;

public class MakeCoffee implements Message {
    @Override
    public String messageType() {
        return MESSAGE_TYPE;
    }

    @Override
    public String content() {
        return CONTROL_MAKE_COFFEE;
    }
}
