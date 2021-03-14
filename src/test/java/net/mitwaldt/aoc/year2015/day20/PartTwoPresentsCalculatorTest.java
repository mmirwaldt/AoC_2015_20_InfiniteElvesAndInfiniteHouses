package net.mitwaldt.aoc.year2015.day20;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static net.mitwaldt.aoc.year2015.day20.PresentsCalculatorUtil.countPresentsForHouseInPartTwo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartTwoPresentsCalculatorTest {
    @Test
    void test_countPresentsForHouse() {
        assertEquals(11, countPresentsForHouseInPartTwo(1));
        assertEquals(11 + 22, countPresentsForHouseInPartTwo(2));
        assertEquals(11 + 33, countPresentsForHouseInPartTwo(3));
        assertEquals(11 + 22 + 44, countPresentsForHouseInPartTwo(4));
        assertEquals(11 + 55, countPresentsForHouseInPartTwo(5));
        assertEquals(11 + 22 + 33 + 66, countPresentsForHouseInPartTwo(6));
        assertEquals(11 + 77, countPresentsForHouseInPartTwo(7));
        assertEquals(11 + 22 + 44 + 88, countPresentsForHouseInPartTwo(8));
        assertEquals(11 + 33 + 99, countPresentsForHouseInPartTwo(9));
        assertEquals(23 * 11 + 1 * 11, countPresentsForHouseInPartTwo(23));

        int expectedHouse51 = 0;
        for (int elf = 2; elf <= 25; elf++) {
            if(51 % elf == 0) {
                expectedHouse51 += elf * 11;
            }
        }
        expectedHouse51 += 51 * 11;
        assertEquals(expectedHouse51, countPresentsForHouseInPartTwo(51));

        int expectedHouse102 = 0;
        for (int elf = 3; elf <= 51; elf++) {
            if(102 % elf == 0) {
                expectedHouse102 += elf * 11;
            }
        }
        expectedHouse102 += 102 * 11;
        assertEquals(expectedHouse102, countPresentsForHouseInPartTwo(102));
    }
}
