package com.me4502.adventofcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Day_1 {

    public static void main(String[] args) {
        String input = null;
        try {
            input = Files.readAllLines(Paths.get("Day_1.txt")).stream().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
