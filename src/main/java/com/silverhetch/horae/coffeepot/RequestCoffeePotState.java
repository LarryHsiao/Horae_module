package com.silverhetch.horae.coffeepot;

import com.google.gson.JsonObject;
import com.silverhetch.horae.Message;

public class RequestCoffeePotState implements Message {
    @Override
    public String messageType() {
        return Const.MESSAGE_TYPE_COFFEE_POT;
    }

    @Override
    public String content() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("contentType", Const.COFFEE_POT_STATE);
        return jsonObject.toString();
    }
}
