package com.debuggeando_ideas.util_function.examples.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionApp {

    static BiFunction<Integer, String, String> combiner = (item1, item2) -> item1 + item2;

    public static void main(String[] args) {
        // BiFunction have the same behaviour as Function interface but with two parameters
        System.out.println("A simple combiner: " + combiner.apply(2, " HP"));

        List<String> list1 = List.of("a", "b", "c");
        List<Integer> list2 = List.of(1, 2, 3);
        List<String> resul = listCombiner(list1, list2, (l1, l2) -> l1 + l2);
        System.out.println("Combining two list: " + resul);
        System.out.println("Combining two ");
    }

    private static<T, U, R> List<R> listCombiner(List<T> list1, List<U> list2,
                                                 BiFunction<T, U, R> combiner) {
    List<R> resul = new ArrayList<>();
    for (int i = 0; i < list1.size(); i++) {
        resul.add(combiner.apply(list1.get(i), list2.get(i)));
    }
    return resul;
    }
}
