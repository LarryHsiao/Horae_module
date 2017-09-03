package com.silverhetch.horae.coffeepot;

import com.silverhetch.horae.Message;

public class RequestCoffeePotState implements Message {
    @Override
    public String messageType() {
        return Const.MESSAGE_TYPE_COFFEE_POT;
    }

    @Override
    public String content() {
        return Const.COFFEE_POT_STATE;
    }
}
