package com.debuggeando_ideas.real_appplications.examples.strategy;

@FunctionalInterface
public interface ApplyDiscountStrategy {

    Double get(Double price);
}
