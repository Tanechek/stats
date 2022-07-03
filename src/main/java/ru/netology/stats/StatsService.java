package ru.netology.stats;

public class StatsService {

    public double getSumSales(double[] sales) {
        double Sum = 0;
        for (double sale : sales) {
            Sum += sale;
        }
        return Sum;
    }

    public double getAverageSumSales(double[] sales) {
        double averageSum = 0;
        for (double sale : sales) {
            averageSum += sale;
        }
        return averageSum / sales.length;
    }

    public int getMaxSales(double[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (double sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int getMinSales(double[] sales) {
        int minMonth = 0;
        int month = 0;
        for (double sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    
    public int getMonthsAmountWhereSalesValueLowerThanAverage(double[] sales) {
        double averageSumSales = getAverageSumSales(sales);
        int months = 0;
        for (double sale : sales) {
            if (sale > averageSumSales) {
                months++;
            }
        }
        return months;
    }

    public int getMonthsAmountWhereSalesValueHigherThanAverage(double[] sales) {
        double averageSumSales = getAverageSumSales(sales);
        int months = 0;
        for (double sale : sales) {
            if (sale < averageSumSales) {
                months++;
            }
        }
        return months;
    }
}
