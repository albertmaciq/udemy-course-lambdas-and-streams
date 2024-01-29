package com.debuggeando_ideas.util_function.examples.consumer;

import java.util.Map;

public class BiConsumerApp {

    public static void main(String[] args) {
        Map<Boolean, String> map = Map.of(true, "This is the true",
                false, "This is a lie");
        map.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
