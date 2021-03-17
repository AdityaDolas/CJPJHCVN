package com.designPattern.singleton;

public class Exec {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Satellite s = Satellite.getInstance();
            System.out.println(s.hashCode());
        }
    }
}
