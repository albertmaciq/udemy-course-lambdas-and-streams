package com.debuggeando_ideas.collectors.examples;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionPartitionApp {

    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();

        // partition divides in partitions a set of data attending to a predicate
        Map<Boolean, List<Videogame>> result = videogameStream.collect(Collectors.partitioningBy(
                item -> item.getPrice() > 15
        ));

        result.forEach((k, v) -> System.out.println("partitionResul: " + k + " |data: " + v));
    }
}
