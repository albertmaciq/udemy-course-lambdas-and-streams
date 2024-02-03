package com.debuggeando_ideas.optional;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Optional;

public class OptionalMapApp {

    public static void main(String[] args) {
        Optional<Videogame> gtaOptional = Optional.of(Database.videogames.get(5));
        String website = gtaOptional.map(item -> "The official website is " + item.getOfficialWebsite())
                .orElseThrow(RuntimeException::new);

        System.out.println(website);
    }
}
