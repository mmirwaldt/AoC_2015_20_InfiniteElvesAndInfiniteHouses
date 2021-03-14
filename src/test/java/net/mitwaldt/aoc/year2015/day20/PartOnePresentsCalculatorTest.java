package net.mitwaldt.aoc.year2015.day20;

import org.junit.jupiter.api.Test;

import static net.mitwaldt.aoc.year2015.day20.PresentsCalculatorUtil.countPresentsForHouseInPartOne;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartOnePresentsCalculatorTest {
    @Test
    void test_countPresentsForHouse() {
        assertEquals(10, countPresentsForHouseInPartOne(1));
        assertEquals(30, countPresentsForHouseInPartOne(2));
        assertEquals(40, countPresentsForHouseInPartOne(3));
        assertEquals(70, countPresentsForHouseInPartOne(4));
        assertEquals(60, countPresentsForHouseInPartOne(5));
        assertEquals(120, countPresentsForHouseInPartOne(6));
        assertEquals(80, countPresentsForHouseInPartOne(7));
        assertEquals(150, countPresentsForHouseInPartOne(8));
        assertEquals(130, countPresentsForHouseInPartOne(9));
        assertEquals(23 * 10 + 1 * 10, countPresentsForHouseInPartOne(23));
    }
}
