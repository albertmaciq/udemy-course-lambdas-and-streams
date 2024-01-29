package com.debuggeando_ideas.util_function.examples.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApp {

    static Predicate<Integer> isGreaterThan100 = item -> item > 100;
    static Predicate<Integer> isLessThan10= item -> item < 10;
    static Predicate<Integer> isBetween10And100 = isGreaterThan100.or(isLessThan10);
    static Predicate<Integer> isNotBetween10And100 = isBetween10And100.negate();

    // In this case does not work properly because that two predicates can not happen
    // at the same time
    static Predicate<Integer> isGreaterThan100AndLessThan10 = isGreaterThan100.and(isLessThan10);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 50, 100, 150, 200));
        numbers.removeIf(isGreaterThan100AndLessThan10);
        System.out.println("Remove attending to defining predicates : " + numbers);
    }
}
