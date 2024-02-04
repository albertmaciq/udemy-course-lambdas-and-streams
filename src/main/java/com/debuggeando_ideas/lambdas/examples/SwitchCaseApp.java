package com.debuggeando_ideas.lambdas.examples;

public class SwitchCaseApp {

    public static void main(String[] args) {
        var result = switch ("ONE") {
            case "ONE" -> 1;
            case "TWO" -> 2;
            case "THREE" -> 3;
            default -> 0;
        };
        System.out.println(result);
    }
}
