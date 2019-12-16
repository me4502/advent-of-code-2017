package com.me4502.adventofcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Day_3 {

    public static void main(String[] args) {
        int input = Integer.MIN_VALUE;
        try {
            input = Files.readAllLines(Paths.get("Day_3.txt")).stream().mapToInt(Integer::valueOf).sum();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(input);
        int next = 0;
        while (true) {

        }
    }
}
