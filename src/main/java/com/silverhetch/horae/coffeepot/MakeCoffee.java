package com.silverhetch.horae.coffeepot;

import com.silverhetch.horae.Message;

import static com.silverhetch.horae.coffeepot.Const.MAKE_COFFEE;
import static com.silverhetch.horae.coffeepot.Const.MESSAGE_TYPE_COFFEE_POT;

public class MakeCoffee implements Message {
    @Override
    public String messageType() {
        return MESSAGE_TYPE_COFFEE_POT;
    }

    @Override
    public String content() {
        return MAKE_COFFEE;
    }
}
