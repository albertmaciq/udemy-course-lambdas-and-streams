package com.debuggeando_ideas.lambdas.examples;

import com.debuggeando_ideas.lambdas.Math;

public class LambdaApp {

    public static void main(String[] args) {
        // this is an anonymous class
        Math subtraction = new Math() {
            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }
        };

        System.out.println("This is a subtraction with anonymous class: " + subtraction.execute(5.5, 3.0));

        Math multiply = (a, b) -> a * b;
        System.out.println("This is a multiplication with lambda expression: " + multiply.execute(10.0, 2.5));

        Math divide = (a, b) -> {
            System.out.println("The division starts ...");
            return a / b;
        };
        System.out.println("This is a division with lambda expression: " + divide.execute(10.0, 2.5));

        System.out.println("Calling interface default's method(sum): " + divide.sum(10.0, 5.0));
    }
}
