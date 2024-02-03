package com.debuggeando_ideas.streams.examples;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class FinalStreamOperatorsApp {

    static void countOperator(Stream<Videogame> videogameStream) {
        System.out.println("Count operator: " + videogameStream.count());
    }

    static void anyMatchOperator(Stream<Videogame> videogameStream) {
        boolean anyMatchResul = videogameStream.anyMatch(item -> item.getTotalSold() > 5);
        System.out.println("AnyMatch operator: " + anyMatchResul);
    }

    static void allMatchOperator(Stream<Videogame> videogameStream) {
        boolean allMatchResul = videogameStream.allMatch(item -> item.getTotalSold() > 1);
        System.out.println("AllMatch operator: " + allMatchResul);

    }

    static void noneMatchOperator(Stream<Videogame> videogameStream) {
        boolean noneMatchResul = videogameStream.noneMatch(item -> item.getReviews().isEmpty());
        System.out.println("NoneMatch operator: " + noneMatchResul);
    }

    static void findFirstOperator(Stream<Videogame> videogameStream) {
        Optional<Videogame> findFirstResul = videogameStream.findFirst();
        System.out.println("FindFirst operator: " + findFirstResul);
    }

    static void findAnyOperator(Stream<Videogame> videogameStream) {
        Optional<Videogame> findAnyResul = videogameStream.findAny();
        System.out.println("FindAny operator: " + findAnyResul);
    }

    static void reduceOperator(Stream<Videogame> videogameStream) {
        Optional<Integer> reduceResul = videogameStream
                .filter(Videogame::getIsDiscount)
                .map(Videogame::getTotalSold)
                .reduce(Integer::sum);
        System.out.println("Reduce operator: " + reduceResul);
    }

    static void minOperator(Stream<Videogame> videogameStream) {
        Optional<Videogame> minResul = videogameStream.min(Comparator.comparing(Videogame::getName));
        System.out.println("Min operator: " + minResul);
    }

    static void maxOperator(Stream<Videogame> videogameStream) {
        Optional<Videogame> maxResul = videogameStream.max(Comparator.comparing(Videogame::getName));
        System.out.println("Max operator: " + maxResul);
    }

    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        maxOperator(videogameStream);
    }
}
