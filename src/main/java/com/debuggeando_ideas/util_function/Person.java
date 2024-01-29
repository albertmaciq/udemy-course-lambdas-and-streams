package com.debuggeando_ideas.util_function;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Person implements Serializable {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
