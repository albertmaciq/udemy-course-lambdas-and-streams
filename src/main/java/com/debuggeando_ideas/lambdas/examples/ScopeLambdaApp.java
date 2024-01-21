package com.debuggeando_ideas.lambdas.examples;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ScopeLambdaApp {

    public static void main(String[] args) {
        // AtomicXXX variables are allowed to be used in lambdas,
        // because they are concurrent variables.
        AtomicInteger number = new AtomicInteger(10);
        IntStream.range(1, 10).forEach(item -> number.set(number.get() + item));

        System.out.println(number.get());
    }
}