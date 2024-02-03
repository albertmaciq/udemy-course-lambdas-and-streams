package com.debuggeando_ideas.collectors;

import com.debuggeando_ideas.util.Console;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Review;
import com.debuggeando_ideas.util.Videogame;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExercises {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
        getConsolesPricesAvg(videogames).forEach((k, v) -> System.out.println(k + " - " + v));
    }

    /*
     * return an immutable list with all the reviews of the stream.
     */
    static List<Review> getReviews(Stream<Videogame> stream) {
        return stream.flatMap(item -> item.getReviews().stream()).collect(Collectors.toUnmodifiableList());
    }

    /*
     * returns a true map with all games that have an url (web page)
     * with a length less than 15 otherwise returns false with a
     * list of games that do not meet the condition.
     */
    static Map<Boolean, List<Videogame>> getWebSites(Stream<Videogame> stream) {
        return stream.collect(Collectors.partitioningBy(item -> item.getOfficialWebsite().length() < 15));
    }

    /*
     *  returns in a map the average sales of all consoles.
     *  The map key will be the console and the value will be the average sales.
     */
    static Map<Console, Double> getConsolesPricesAvg(Stream<Videogame> stream) {
        return stream.collect(Collectors.groupingBy(Videogame::getConsole,
                Collectors.averagingDouble(Videogame::getTotalSold)));
    }
}
