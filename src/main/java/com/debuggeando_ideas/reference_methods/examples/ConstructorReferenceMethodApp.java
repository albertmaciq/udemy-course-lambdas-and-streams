package com.debuggeando_ideas.reference_methods.examples;

import com.debuggeando_ideas.reference_methods.MyObject;

import java.util.function.Supplier;

public class ConstructorReferenceMethodApp {

    public static void main(String[] args) {
        Supplier<MyObject> object = MyObject::new;
        System.out.println("An instance of: " + object.get());
    }
}
