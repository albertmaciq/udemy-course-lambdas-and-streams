package com.debuggeando_ideas.util_function.examples.predicate;

import java.util.function.BiPredicate;

public class BiPredicateApp {

    static BiPredicate<String, String> myEquals = (s1, s2) -> s1.concat(s2).equals("Backlog");

    public static void main(String[] args) {
        String s1 = "Back";
        String s2 = "log";
        System.out.println("Validate two string: " + myEquals.test(s1, s2));
    }
}
