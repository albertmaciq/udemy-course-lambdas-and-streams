package com.debuggeando_ideas.util;

import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class Movie {

    private String name;

    private Double price;

    public Optional<String> getNameOptional() {
        return Optional.of(this.name);
    }

    public Optional<Double> getPriceOptional() {
        return Optional.of(this.price);
    }
}
