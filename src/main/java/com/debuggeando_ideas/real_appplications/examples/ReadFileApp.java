package com.debuggeando_ideas.real_appplications.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileApp {

    public static void main(String[] args) {
        Path file = Paths.get("src/main/resources/lambdas.txt");

        try (Stream<String> lines = Files.lines(file).onClose(() -> System.out.println("Reader closed"))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
