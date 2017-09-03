package com.silverhetch.horae.coffeepot.ui;

import com.silverhetch.horae.MessageHandle;

public class CoffeePotUIMessageHandle implements MessageHandle {
    private final CoffeePotUI coffeePotUI;

    public CoffeePotUIMessageHandle(CoffeePotUI coffeePotUI) {
        this.coffeePotUI = coffeePotUI;
    }

    @Override
    public String messageType() {
        return Const.COFFEE_POT_UI;
    }

    @Override
    public void onReceive(String message) {
        switch (message) {
            case Const.STATE:
                coffeePotUI.updateState(message);
                break;
        }
    }
}
