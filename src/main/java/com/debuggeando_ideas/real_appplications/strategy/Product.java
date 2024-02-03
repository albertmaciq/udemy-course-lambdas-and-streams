package com.debuggeando_ideas.real_appplications.strategy;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    private Long id;
    private String userType;
    private String name;
    private Double price;
    private Double discount;
    private ApplyDiscountStrategy discountStrategy;
}
