package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public long calculateAverage(long[] sales) {
        long sum = calculateSum(sales);
        long average = sum / sales.length;
        return average;
    }

    public long findMax(long[] sales) {
        long currentMax = 0;

        for (long sale : sales) {
            if (sale > currentMax) {
                currentMax = sale;
            }
        }
        long month = 0;
        long monthNumber = 0;
        for (long sale : sales) {
            month++;
            if (sale == currentMax) {
                monthNumber = month;
            }
        }
        return monthNumber;
    }

    public long findMin(long[] sales) {
        long currentMin = sales[0];

        for (long sale : sales) {
            if (sale < currentMin) {
                currentMin = sale;
            }
        }
        long month = 0;
        long monthNumber = 0;
        for (long sale : sales) {
            month++;
            if (sale == currentMin) {
                monthNumber = month;
            }
        }
        return monthNumber;
    }

    public long findAboveAverage(long[] sales) {
        long number = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (sale > average) {
                number++;
            }
        }
        return number;
    }
    public long findBelowAverage(long[] sales) {
        long number = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                number++;
            }
        }
        return number;
    }
}
