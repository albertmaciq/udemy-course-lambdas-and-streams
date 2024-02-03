package com.debuggeando_ideas.real_appplications;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ConcurrencyLambdasApp {

    static Runnable printerSum = () -> {
        long result = 0;
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100000; i++) {
            result += i;
        }
        System.out.println("Total: " + result);
    };

    static Callable<Long> getSum = () -> {
        long result = 0;
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100000; i++) {
            result += i;
        }
        return result;
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var exec = Executors.newSingleThreadScheduledExecutor();
        exec.submit(printerSum);

        var result = exec.submit(getSum);
        System.out.println("The result: " + result.get());

        exec.shutdown();
    }
}
