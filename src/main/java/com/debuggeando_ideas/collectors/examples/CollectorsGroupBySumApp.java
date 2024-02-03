package com.debuggeando_ideas.collectors.examples;

import com.debuggeando_ideas.util.Console;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsGroupBySumApp {

    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();

        Map<Console, IntSummaryStatistics> result = videogameStream.collect(Collectors.groupingBy(
                Videogame::getConsole,
                Collectors.summarizingInt(Videogame::getTotalSold)
        ));

        result.forEach((k, v) -> System.out.println("console: " + k + " |totalSold: " + v.getSum()));
    }
}
