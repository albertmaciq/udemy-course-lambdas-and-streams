package com.debuggeando_ideas.reference_methods.examples;

import java.util.UUID;
import java.util.function.Supplier;

public class StaticReferenceMethodApp {

    public static void main(String[] args) {
        Supplier<UUID> token = UUID::randomUUID;
        System.out.println("Random token: " + token.get());
    }
}
