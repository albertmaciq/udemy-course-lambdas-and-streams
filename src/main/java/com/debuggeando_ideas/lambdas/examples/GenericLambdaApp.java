package com.debuggeando_ideas.lambdas.examples;

import com.debuggeando_ideas.fundamentals.Employee;
import com.debuggeando_ideas.fundamentals.Product;
import com.debuggeando_ideas.lambdas.Printer;

public class GenericLambdaApp {

    public static void main(String[] args) {
        // An example of using generic lambdas
        Printer<Product> productPrinter = System.out::println;
        Product product = Product.builder()
                .id(21321L)
                .name("Smartphone")
                .price(900.80)
                .build();

        productPrinter.print(product);

        Printer<Employee> employeePrinter = System.out::println;
        Employee employee = Employee.builder()
                .dni("6348971930")
                .name("Pedro")
                .salary(1900.00).build();

        employeePrinter.print(employee);
    }
}
