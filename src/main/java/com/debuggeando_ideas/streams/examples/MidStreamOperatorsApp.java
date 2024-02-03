package com.debuggeando_ideas.streams.examples;

import com.debuggeando_ideas.util.BasicVideogame;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Review;
import com.debuggeando_ideas.util.Videogame;

import java.util.Comparator;
import java.util.stream.Stream;

public class MidStreamOperatorsApp {

    static void distinctOperator(Stream<Videogame> videogameStream) {
        System.out.println("Distinct operator: " + videogameStream.distinct().count());
    }

    static void limitOperator(Stream<Videogame> videogameStream) {
        Stream<Videogame> limitResul = videogameStream.limit(10);
        limitResul.forEach(System.out::println);
    }

    static void skipOperator(Stream<Videogame> videogameStream) {
        Stream<Videogame> skipResul = videogameStream.skip(15);
        skipResul.forEach(System.out::println);
    }

    static void filterOperator(Stream<Videogame> videogameStream) {
        Stream<Videogame> filterResul = videogameStream.filter(item -> item.getPrice() > 12.0)
                .filter(item -> !item.getIsDiscount())
                .filter(item -> item.getOfficialWebsite().contains("forza"));
        filterResul.forEach(System.out::println);
    }

    // to transform data
    static void mapOperator(Stream<Videogame> videogameStream) {
        Stream<BasicVideogame> mapResul = videogameStream.map(item -> BasicVideogame.builder()
                .name(item.getName())
                .price(item.getPrice())
                .console(item.getConsole())
                .build());
        mapResul.forEach(System.out::println);
    }

    static void flatMapOperator(Stream<Videogame> videogameStream) {
        Stream<Review> flatMapResul = videogameStream.flatMap(item -> item.getReviews().stream());
        flatMapResul.forEach(System.out::println);
    }

    // its behaviour is the same as forEach, but it's a mid-operator not a final
    static void peekOperator(Stream<Videogame> videogameStream) {
        Stream<Videogame> peekResul = videogameStream.peek(item -> item.setName(""));
        peekResul.forEach(System.out::println);
    }

    static void sortOperator(Stream<Videogame> videogameStream) {
        Stream<Videogame> sortResul = videogameStream
                .sorted(Comparator.comparingInt(item -> item.getReviews().size()));
        sortResul.forEach(System.out::println);
    }

    static void takeWhileOperator(Stream<Videogame> videogameStream) {
        Stream<Videogame> takeWhileResul = videogameStream
                .sorted(Comparator.comparing(Videogame::getName))
                .takeWhile(item -> !item.getName().startsWith("M"));
        takeWhileResul.forEach(System.out::println);
    }

    static void dropWhileOperator(Stream<Videogame> videogameStream) {
        Stream<Videogame> dropWhileResul = videogameStream
                .sorted(Comparator.comparing(Videogame::getName))
                .dropWhile(item -> !item.getName().startsWith("M"));
        dropWhileResul.forEach(System.out::println);
    }


    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        dropWhileOperator(videogameStream);
    }
}
