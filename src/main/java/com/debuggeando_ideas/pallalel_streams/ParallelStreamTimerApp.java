package com.debuggeando_ideas.pallalel_streams;

import java.util.stream.IntStream;

public class ParallelStreamTimerApp {

    static void normalStream(Integer rangeUpperLimit) {
        long startTime = System.currentTimeMillis();
        IntStream.rangeClosed(1, rangeUpperLimit).reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time of normal stream with "
                + rangeUpperLimit + ": " + (endTime - startTime));
    }

    static void parallelStream(Integer rangeUpperLimit) {
        long startTime = System.currentTimeMillis();
        IntStream.rangeClosed(1, rangeUpperLimit).parallel().reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time of parallel stream with "
                + rangeUpperLimit + ": " + (endTime - startTime));
    }

    public static void main(String[] args) {
       normalStream(200);
       parallelStream(200);
       normalStream(200000000);
       parallelStream(200000000);
    }
}
