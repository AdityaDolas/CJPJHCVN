package com.strategy.enable;

public class Watch {
    public Name name;
    public Type type;
    
    public String getName(){
        return name.name();
    }

    public void setName(Name newName){
        name = newName;
    }
    
    public String getType(){
        return type.type();
    }
    
    public void setType(Type newType){
        type = newType;
    }
}
