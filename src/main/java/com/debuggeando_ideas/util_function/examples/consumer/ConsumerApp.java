package com.debuggeando_ideas.util_function.examples.consumer;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ConsumerApp {

    public static void main(String[] args) {
        // Consumer does not return a value, it's just operating with some objects
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5);
        List<Integer> squares = new LinkedList<>();

        numbers.forEach(item -> squares.add(item * item));
        System.out.println("Consumer behaviour: " + squares);
    }
}
