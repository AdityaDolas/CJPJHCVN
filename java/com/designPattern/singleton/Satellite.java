package com.designPattern.singleton;

public class Satellite {
    
    // Create Static instance of this class
    static Satellite obj = new Satellite();
    
    // Define a private constructor
    private Satellite(){
        
    }
    
    // Create a Static method which return obj of this class
    public static Satellite getInstance(){
        return obj;
    }
}
