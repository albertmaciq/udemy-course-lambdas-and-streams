package com.debuggeando_ideas.streams.examples;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamsConstructApp {

    public static void main(String[] args) {
        // Construct stream ways
        Stream<Videogame> videogameStream = Database.videogames.stream();
        videogameStream.forEach(System.out::println);

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream<Integer> intStream = Arrays.stream(intArray);
        intStream.forEach(System.out::println);

        Stream.of("Hello", "World!").forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.of(20.3, 30.2, 0.0);
        doubleStream.forEach(System.out::println);
    }
}
