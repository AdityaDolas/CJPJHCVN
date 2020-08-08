package com.strategy.enable;

public class Buyer {
    public static void main(String[] args) {
         Watch watch = new Seiko();
        System.out.println("Watch : " + watch.getName());
        System.out.println("Watch type is : " + watch.getType());
    }
}
