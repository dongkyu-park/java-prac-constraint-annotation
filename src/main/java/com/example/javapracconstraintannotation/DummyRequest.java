package com.example.javapracconstraintannotation;

import lombok.Getter;

@Getter
public class DummyRequest {

    private String value;
    private int number;

    @CustomValid(enumClass = Fruit.class)
    private Fruit fruit;

    @Override
    public String toString() {
        return "\n value : " + value
                + "\n number : " + number
                + "\n fruit : " + fruit;
    }
}
