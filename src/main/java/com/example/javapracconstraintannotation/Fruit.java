package com.example.javapracconstraintannotation;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Fruit {

    APPLE, BANANA, MANGO;

    @JsonCreator
    public static Fruit fromFruit(String requestFruit){
        for(Fruit fruit : Fruit.values()){
            if(fruit.name().equals(requestFruit)){
                return fruit;
            }
        }
        return null;
    }
}
