package com.debuggeando_ideas.util_function.examples.operator;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorApp {

    // UnaryOperator extends of Function
    static UnaryOperator<String> unaryToUpper = String::toUpperCase;
    static IntUnaryOperator intSquare = item -> item * item;

    public static void main(String[] args) {
        String arg = "abc";
        System.out.println("This is an example of unary operator behaviour: " + unaryToUpper.apply(arg));
        System.out.println("This is an example of int unary operator behaviour: " + intSquare.applyAsInt(10));
    }
}
