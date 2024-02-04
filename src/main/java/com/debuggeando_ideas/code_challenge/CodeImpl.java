package com.debuggeando_ideas.code_challenge;

class CodeImpl {

    public static PerformOperation isOdd() {
        return n -> (n % 2 == 1);
    }

    public static PerformOperation isPrime() {
        return n -> {
            int divider = 1;
            int count = 0;
            while (divider <= n) {
                if (n % divider == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
                divider++;
            }
            return count == 2;
        };
    }

    public static PerformOperation isPalindrome() {
        return n -> {
            String numString = Integer.toString(n);
            char[] chars = numString.toCharArray();
            int charsLength = chars.length;
            for (int i =0 , r = charsLength - 1; i < charsLength; i++, r--) {
                if (chars[i] != chars[r]) {
                    return false;
                }
            }
            return true;
        };
    }
}
