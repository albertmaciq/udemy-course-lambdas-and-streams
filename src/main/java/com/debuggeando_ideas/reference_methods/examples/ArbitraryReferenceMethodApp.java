package com.debuggeando_ideas.reference_methods.examples;

import java.util.function.BiPredicate;

public class ArbitraryReferenceMethodApp {

    public static void main(String[] args) {
        BiPredicate<String, String> equals = String::equals;
        String word1 = "bowl";
        String word2 = "owl";
        boolean resul = equals.test(word1, word2);
        System.out.printf("It's %s equals to %s?: %b%n", word1, word2, resul);
    }
}
