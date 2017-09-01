package com.silverhetch.horae;

public class Sample implements MessageHandle {
    @Override
    public int messageType() {
        return 0;
    }

    @Override
    public void onReceive(String s) {

    }
}
