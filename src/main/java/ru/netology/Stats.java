package ru.netology;

public class Stats {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public long calculateAverage(long sum) {
        long average = sum / 12;
        return average;
    }

    public long findMax(long[] sales) {
        long currentMax = sales[0];
        for (long sale : sales) {
            if (currentMax <= sale) {
                currentMax = sale;
            }
            int monthNumber = i + 1;

            //не понимаю, каким образом вообще вывести значение индекса нужного элемента массива
            //и потому номер месяца с минимальной продаже здесь пока не буду писать
        }
        return monthNumber;
    }

    public long findAboveAverage(long[] sales, long average) {
        int number = 0;
        long aboveAverage = sales[0];
        for (long sale : sales) {
            if (aboveAverage > average) {
                number = number + 1;
            }
        }
        return number;
    }
}





