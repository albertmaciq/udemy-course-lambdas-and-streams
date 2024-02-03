package com.debuggeando_ideas.real_appplications.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdas {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 3, 6, 8, 7, 5, 8, 20);
        numbers.sort(Comparator.comparingInt(a -> a));
        System.out.println("Ordered numbers list: " + numbers);

        List<String> names = Arrays.asList("Max", "Alex", "Opal");
        names.sort(String::compareTo);
        System.out.println("Ordered names list: " + names);
        names.sort(Comparator.reverseOrder());
        System.out.println("Inverse order of names list: " + names);

        List<Person> people = Arrays.asList(new Person("Robert", 31),
                new Person("Marie", 32), new Person("Pete", 25),
                new Person("Cris", 25), new Person("Levi", 31));

       // in case of the same age use another criteria
        people.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
        System.out.println("Ordered people list: " + people);
    }
}


