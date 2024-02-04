package com.debuggeando_ideas.code_challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CodeChallengeApp {

    @Test
    public void startTest() {

        PerformOperation isOdd = CodeImpl.isOdd();
        PerformOperation isPrime = CodeImpl.isPrime();
        PerformOperation isPalindrome = CodeImpl.isPalindrome();

        int[] isOddCases = {3,7,9,2,8};
        int[] isPrimeCases = {2,31,97,42,98};
        int[] isPalindromeCases = {54322345,710101017,888,7848729,783483002};


        assertAll( "Test isOdd" ,
                () -> assertTrue(isOdd.check(isOddCases[0])),
                () -> assertTrue(isOdd.check(isOddCases[1])),
                () -> assertTrue(isOdd.check(isOddCases[2])),
                () -> assertFalse(isOdd.check(isOddCases[3])),
                () -> assertFalse(isOdd.check(isOddCases[4]))
        );

       assertAll( "Test isPrime" ,
                () -> assertTrue(isPrime.check(isPrimeCases[0])),
                () -> assertTrue(isPrime.check(isPrimeCases[1])),
                () -> assertTrue(isPrime.check(isPrimeCases[2])),
                () -> assertFalse(isPrime.check(isPrimeCases[3])),
                () -> assertFalse(isPrime.check(isPrimeCases[4]))
        );

        assertAll( "Test isPalindrome" ,
                () -> assertTrue(isPalindrome.check(isPalindromeCases[0])),
                () -> assertTrue(isPalindrome.check(isPalindromeCases[1])),
                () -> assertTrue(isPalindrome.check(isPalindromeCases[2])),
                () -> assertFalse(isPalindrome.check(isPalindromeCases[3])),
                () -> assertFalse(isPalindrome.check(isPalindromeCases[4]))
        );
    }

    public static void main(String[] args) {
        PerformOperation isOdd = CodeImpl.isOdd();
        PerformOperation isPrime = CodeImpl.isPrime();
        PerformOperation isPalindrome = CodeImpl.isPalindrome();
        int[] isOddCases = {3, 7, 9, 2, 8};
        int[] isPrimeCases = {2, 31, 97, 42, 98};
        int[] isPalindromeCases = {54322345, 710101017, 888, 7848729, 783483002};
        System.out.println("Odd test");
        Arrays.stream(isOddCases).forEach(i -> System.out.println(isOdd.check(i))); //true, true, true, false, false
        System.out.println("isPrime test");
        Arrays.stream(isPrimeCases).forEach(i -> System.out.println(isPrime.check(i))); //true, true, true, false, false
        System.out.println("isPalindrome test");
        Arrays.stream(isPalindromeCases).forEach(i -> System.out.println(isPalindrome.check(i))); //true, true, true, false, false
    }
}


