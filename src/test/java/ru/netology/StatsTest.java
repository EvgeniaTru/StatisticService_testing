package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsTest {

    @ParameterizedTest
    @CsvSource({
                    "'8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18'"
            })

    void calculateSum(long[] sales) {
        Stats service = new Stats ();
        

    })

    @Test
    void calculateAverage() {
    }

    @Test
    void findMax() {
    }

    @Test
    void findAboveAverage() {
    }
}