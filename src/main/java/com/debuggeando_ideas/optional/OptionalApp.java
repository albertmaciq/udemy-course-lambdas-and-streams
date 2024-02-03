package com.debuggeando_ideas.optional;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {
        Optional<Videogame> gtaOptional = Optional.of(Database.videogames.get(5));
        Optional<Videogame> videogameOptional = Optional.empty();
        System.out.println(gtaOptional.get());
        System.out.println(videogameOptional.orElse(Database.videogames.get(6)));
        System.out.println(videogameOptional.orElseThrow(() -> new RuntimeException("Videogame not found")));
    }
}
