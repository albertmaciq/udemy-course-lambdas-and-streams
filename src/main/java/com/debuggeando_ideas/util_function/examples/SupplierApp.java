package com.debuggeando_ideas.util_function.examples;

import com.debuggeando_ideas.util_function.MyProduct;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierApp {

    static Supplier<Integer> randomInt = () -> new Random().nextInt(100);
    static Supplier<MyProduct> productSupplier = () -> new MyProduct(100, "Smartphone");

    public static void main(String[] args) {
        // Supplier is the opposite of consumer, which means that supplier provides objects
        System.out.println("This is a random number: " + randomInt.get());
        System.out.println("This is a random number: " + randomInt.get());
        System.out.println("This is a random number: " + randomInt.get());
        System.out.println("This is a product: " + productSupplier.get());
    }
}
