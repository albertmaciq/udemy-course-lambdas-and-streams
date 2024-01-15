package com.debuggeando_ideas.lambdas.examples;

import java.util.List;

public class ForEachLambdaApp {

    public static void main(String[] args) {
        List<String> countries = List.of("Mexico", "Spain", "Switzerland", "Cuba");
        countries.forEach(System.out::println);
    }
}
