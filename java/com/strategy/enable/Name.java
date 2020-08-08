package com.strategy.enable;

public interface Name {
    String name();
}

class FossilName implements Name {
    @Override
    public String name() {
        return "Fossil";
    }
}

class SeikoName implements Name {
    @Override
    public String name() {
        return "Seiko";
    }
}

class RollexName implements Name {
    @Override
    public String name() {
        return "Rollex";
    }
}
