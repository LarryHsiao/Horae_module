package com.silverhetch.horae.coffeepot;

import com.silverhetch.horae.MessageHandle;

import static com.silverhetch.horae.coffeepot.Const.COFFEE_POT_STATE;
import static com.silverhetch.horae.coffeepot.Const.MAKE_COFFEE;

public class CoffeePotMessageHandle implements MessageHandle {
    private final CoffeePot coffeePot;

    public CoffeePotMessageHandle(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    @Override
    public String messageType() {
        return Const.MESSAGE_TYPE_COFFEE_POT;
    }

    @Override
    public void onReceive(String content) {
        switch (content) {
            case MAKE_COFFEE:
                coffeePot.makeCoffee();
                break;
            case COFFEE_POT_STATE:
                coffeePot.updateState();
                break;
        }
    }
}
