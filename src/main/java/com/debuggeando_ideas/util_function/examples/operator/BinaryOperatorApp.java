package com.debuggeando_ideas.util_function.examples.operator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorApp {

    public static void main(String[] args) {
        BiFunction<String, String, String> normalizerFunc = (a, b) -> a.toLowerCase().concat(b.toUpperCase());
        System.out.println("This is the result of apply BiFunction: " + normalizerFunc.apply("hello","World!"));

        BinaryOperator<String> normalizerBinaryFunc = (a, b) -> a.toLowerCase().concat(b.toUpperCase());
        System.out.println("This is the result of apply BinaryOperator: " +normalizerBinaryFunc.apply("hello","World!"));
    }
}
