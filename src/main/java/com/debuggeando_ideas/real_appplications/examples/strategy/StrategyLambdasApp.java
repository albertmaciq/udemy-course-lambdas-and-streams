package com.debuggeando_ideas.real_appplications.examples.strategy;

import java.util.List;

public class StrategyLambdasApp {

    public static void main(String[] args) {
        var product1 = Product.builder().id(1L).name("Bear").price(150.0).userType("BASIC").build();
        var product2 = Product.builder().id(1L).name("Bear").price(150.0).userType("PLUS").build();
        var product3 = Product.builder().id(1L).name("Bear").price(150.0).userType("PRIME").build();
        var products = List.of(product1, product2, product3);

        products.forEach( product -> {
            switch (product.getUserType()) {
                case "BASIC":
                    product.setDiscountStrategy(Strategies.basicDiscount);
                    break;
                case "PLUS":
                    product.setDiscountStrategy(Strategies.plusDiscount);
                    break;
                case "PRIME":
                    product.setDiscountStrategy(Strategies.primeDiscount);
                    break;
            }
        });

        products.forEach(product ->
            System.out.println("Price before discount " + product.getPrice()
                + " for user type " + product.getUserType()
                + "and the discount is " + product.getDiscountStrategy().get(product.getPrice())));
    }
}
