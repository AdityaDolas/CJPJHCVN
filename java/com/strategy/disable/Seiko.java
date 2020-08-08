package com.strategy.disable;

public class Seiko implements Watch {
    @Override
    public String name() {
        return "Seiko";
    }
    
    @Override
    public String type() {
        return "Analog Digital";
    }
}
