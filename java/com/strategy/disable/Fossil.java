package com.strategy.disable;

import com.strategy.disable.Watch;

public class Fossil implements Watch {
    
    @Override
    public String name() {
        return "Fossil";
    }
    
    @Override
    public String  type() {
        return "Digital";
    }
}
