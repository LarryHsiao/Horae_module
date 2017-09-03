package com.silverhetch.horae.coffeepot.ui;

import com.silverhetch.horae.Message;

public class UpdateCoffeePotState implements Message {
    private final String state;

    public UpdateCoffeePotState(String state) {
        this.state = state;
    }

    @Override
    public String messageType() {
        return Const.COFFEE_POT_UI;
    }

    @Override
    public String content() {
        return state;
    }
}
