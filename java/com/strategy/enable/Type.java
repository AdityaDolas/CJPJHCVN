package com.strategy.enable;

public interface Type {
    String type();
}

class FossilType implements Type {
    @Override
    public String type() {
        return "Digital";
    }
}

class SeikoType implements Type {
    @Override
    public String type() {
        return "Analog-Digital";
    }
}

class RollexType implements Type {
    @Override
    public String type() {
        return "Analog";
    }
}