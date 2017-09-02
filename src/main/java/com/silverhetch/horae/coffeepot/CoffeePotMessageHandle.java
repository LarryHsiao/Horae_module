package com.silverhetch.horae.coffeepot;

import com.silverhetch.horae.MessageHandle;

public class CoffeePotMessageHandle implements MessageHandle {
    private final CoffeePot coffeePot;

    public CoffeePotMessageHandle(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    @Override
    public String messageType() {
        return Const.MESSAGE_TYPE;
    }

    @Override
    public void onReceive(String content) {
        switch (content) {
            case Const.CONTROL_MAKE_COFFEE:
                coffeePot.makeCoffee();
                break;
            case Const.CONTROL_STATE:
                coffeePot.state();
                break;
        }
    }
}
