package com.strategy.disable;

public class Buyer {
    public static void main(String[] args) {
        Watch watch = new Rollex();
        System.out.println("Watch is : " + watch.name());
        System.out.println("Watch type is : " + watch.type());
    }
}
