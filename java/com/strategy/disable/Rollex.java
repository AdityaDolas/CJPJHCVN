package com.strategy.disable;

public class Rollex implements Watch{
    @Override
    public String name() {
        return "Rollex";
    }
    
    @Override
    public String type() {
        return "Analog";   
    }
}
