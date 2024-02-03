package com.debuggeando_ideas.real_appplications.strategy;

@FunctionalInterface
public interface ApplyDiscountStrategy {

    Double get(Double price);
}
