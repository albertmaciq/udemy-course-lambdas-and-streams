package com.debuggeando_ideas.optional;

import com.debuggeando_ideas.util.Movie;

import java.util.Optional;

public class OptionalFlatMapApp {

    public static void main(String[] args) {
        Movie movie = new Movie("The Godfather", 20.42);
        Optional<Movie> movieOptional = Optional.of(movie);

        // using flatMap when the nullability is strict
        String movieName = movieOptional.flatMap(Movie::getNameOptional).get();
        System.out.println(movieName);
    }
}
