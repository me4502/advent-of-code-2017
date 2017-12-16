package com.me4502.adventofcode;

public class Day_1 {

    public static void main(String[] args) {
        String input = args[0];
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            char next = input.charAt((i + 1) % input.length());
            if (current == next) {
                sum += Character.getNumericValue(current);
            }
        }

        System.out.println(sum);
    }
}
