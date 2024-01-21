package com.debuggeando_ideas.reference_methods;

import lombok.ToString;

import java.util.Random;
import java.util.UUID;

@ToString
public class MyObject {
    private final String string;
    private final Integer num;

    public MyObject() {
        this.string = UUID.randomUUID().toString();
        this.num = new Random().nextInt(1000);
    }
}
