package com.debuggeando_ideas.streams;

import com.debuggeando_ideas.util.Console;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Review;
import com.debuggeando_ideas.util.Videogame;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class LambdasExercises {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
        exercise5(videogames).forEach(System.out::println);
    }

    /*
     * return true if the stream contains at least one video game with a sales number greater than 10
     * and is not discounted or priced above 9.99 otherwise return false.
     */
    static Boolean exercise1(Stream<Videogame> stream) {
        return stream.anyMatch(item -> item.getTotalSold() > 10 && (!item.getIsDiscount() || item.getPrice() > 9.99));
    }

    /*
     * return a stream only with the titles of all the consoles that are XBOX consoles during the process
     * print the results ignoring the repeated ones.
     */
    static Stream<String> exercise2(Stream<Videogame> stream) {
        return stream
                .distinct()
                .filter(item -> item.getConsole().equals(Console.XBOX))
                .map(Videogame::getName);
    }

    /*
     * returns the video game with the highest number of sales only taking into account the first 10
     * elements of the flow.
     */
    static Videogame exercise3(Stream<Videogame> stream) {
        return stream.limit(10)
                .max(Comparator.comparing(Videogame::getTotalSold))
                .orElseThrow(NoSuchElementException::new);
    }

    /*
     * return a stream with all the comments of each review of all the videogames in the stream.
     */
    static Stream<String> exercise4(Stream<Videogame> stream) {
        return stream
                .flatMap(item -> item.getReviews().stream()
                        .map(Review::getComment));
    }

    /*
     * return a stream with all video games with price less than 20.0 without using the filter() operator.
     */
    static Stream<Double> exercise5(Stream<Videogame> stream) {
        return stream
                .sorted(Comparator.comparingDouble(Videogame::getPrice))
                .takeWhile(item -> item.getPrice() < 20.0)
                .map(Videogame::getPrice);
    }

}
