package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

        StatsService service = new StatsService ();
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void shouldCalculateSum() {
        long expected = 180;
        long actual = service.calculateSum(sales);

        assertEquals(expected,actual);
    }
    @Test
    void shouldCalculateAverage() {
        long expected = 15;
        long actual = service.calculateAverage(sales);

        assertEquals(expected,actual);
    }

    @Test
    void shouldFindMax() {
        long expected = 8;
        long actual = service.findMax(sales);

        assertEquals(expected,actual);
    }

    @Test
    void shouldFindMin() {
        long expected = 9;
        long actual = service.findMin(sales);

        assertEquals(expected,actual);
    }

    @Test
    void shouldFindAboveAverage() {
    long expected = 5;
    long actual = service.findAboveAverage(sales);

    assertEquals (expected,actual);
    }
    @Test
    void shouldFindBelowAverage(){
        long expected = 5;
        long actual = service.findBelowAverage(sales);

        assertEquals (expected,actual);
    }
}