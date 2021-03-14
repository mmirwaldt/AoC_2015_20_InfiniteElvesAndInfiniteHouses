package net.mitwaldt.aoc.year2015.day20;

import java.util.stream.IntStream;

import static net.mitwaldt.aoc.year2015.day20.PresentsCalculatorUtil.*;

public class PresentsCalculatorMain {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
        final int presents = 36000000;
        int houseNumberOfPartOne = IntStream.iterate(1, n -> n + 1)
                .limit(1_000_000)
                .parallel()
                .filter(houseNumber -> presents <= countPresentsForHouseInPartOne(houseNumber))
                .min().orElse(0);

        // result : 831600
        System.out.println(houseNumberOfPartOne);// + " after " + (System.currentTimeMillis() - start) + "ms");

//        start = System.currentTimeMillis();
        int houseNumberOfPartTwo = IntStream.iterate(1, n -> n + 1)
                .limit(1_000_000)
                .parallel()
                .filter(houseNumber -> presents <= countPresentsForHouseInPartTwo(houseNumber))
                .min().orElse(0);

        // result : 884520
        System.out.println(houseNumberOfPartTwo); // + " after " + (System.currentTimeMillis() - start) + "ms");
    }
}
