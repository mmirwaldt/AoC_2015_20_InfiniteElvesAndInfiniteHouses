package net.mitwaldt.aoc.year2015.day20;

public class PresentsCalculatorUtil {
    public static int PRESENTS_FACTOR_FOR_PART_ONE = 10;
    public static int PRESENTS_FACTOR_FOR_PART_TWO = 11;
    public static int MAX_HOUSES_FOR_PART_TWO = 50;

    public static int countPresentsForHouse(int houseNumber, int startElf, int factor) {
        int sum = 0;
        int half = houseNumber / 2;
        if (half != houseNumber) {
            sum += houseNumber * factor;
        }

        int newStartElf;
        final int step;
        if(houseNumber % 2 == 0) {
            newStartElf = startElf;
            step = 1;
        } else {
            if(startElf % 2 == 1) {
                newStartElf = startElf;
            } else {
                newStartElf = startElf + 1;
                if (houseNumber % startElf == 0) {
                    sum += startElf * factor;
                }
            }
            step = 2;
        }

        for (int elf = newStartElf; elf <= half; elf+=step) {
            if (houseNumber % elf == 0) {
                sum += elf * factor;
            }
        }
        return sum;
    }

    public static int countPresentsForHouseInPartOne(int houseNumber) {
        return countPresentsForHouse(houseNumber, 1, PRESENTS_FACTOR_FOR_PART_ONE);
    }

    public static int countPresentsForHouseInPartTwo(int houseNumber) {
        return countPresentsForHouse(houseNumber, houseNumber  / MAX_HOUSES_FOR_PART_TWO + 1,
                PRESENTS_FACTOR_FOR_PART_TWO);
    }
}
