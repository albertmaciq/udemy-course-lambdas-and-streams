package com.debuggeando_ideas.reference_methods.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectReferenceMethodApp {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        IntStream repeat = IntStream.range(1, 11);
        repeat.forEach(numbers::add);

        System.out.println("The list is: " + numbers);
    }
}
