package com.me4502.adventofcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day_2 {

    private static List<Integer> stringArrayToIntList(String[] input) {
        return Arrays.stream(input).map(Integer::parseInt).collect(Collectors.toList());
    }

    private static Integer differenceBetweenMaxAndMin(List<Integer> input) {
        int max = input.stream().max(Comparator.naturalOrder()).orElse(Integer.MAX_VALUE);
        int min = input.stream().min(Comparator.naturalOrder()).orElse(Integer.MIN_VALUE);
        return max - min;
    }

    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<>();
        try {
            input = Files.readAllLines(Paths.get("Day_2.txt")).stream()
                    .map(str -> str.split("\t"))
                    .map(Day_2::stringArrayToIntList)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(input.stream().map(Day_2::differenceBetweenMaxAndMin).mapToInt(value -> value).sum());
    }
}
