package com.debuggeando_ideas.collectors.examples;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsReduceFunctionApp {

    static void avg(Stream<Videogame> stream) {
        Double avg = stream.collect(Collectors.averagingDouble(Videogame::getPrice));
        System.out.println("The avg of videogames price is: " + avg);
    }

    static void sum(Stream<Videogame> stream) {
        IntSummaryStatistics summaryStatistics = stream
                .collect(Collectors.summarizingInt(item -> item.getReviews().size()));
        System.out.println("The sum of reviews is: " + summaryStatistics.getSum());
        System.out.println("The max of reviews is: " + summaryStatistics.getMax());
        System.out.println("The min of reviews is: " + summaryStatistics.getMin());
        System.out.println("The avg of reviews is: " + summaryStatistics.getAverage());
    }

    static void join(Stream<Videogame> stream) {
        String join= stream.map(Videogame::toString).collect(Collectors.joining("\n"));
        System.out.println(join);
    }

    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        join(videogameStream);
    }
}
