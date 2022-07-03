package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void getSumSales(){
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedSumSales = 180;
        double actualSumSales = service.getSumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void getAverageSumSales(){
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAverageSumSales = 15;
        double actualAverageSumSales = service.getAverageSumSales(sales);

        Assertions.assertEquals(expectedAverageSumSales, actualAverageSumSales);
    }

    @Test
    public void getMaxSales(){
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedMaxSales = 8;
        double actualMaxSales = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void getMinSales(){
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedMinSales = 9;
        double actualMinSales = service.getMinSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void getMonthsAmountWhereSalesValueLowerThanAverage(){
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedValue = 5;
        double actualValue = service.getMonthsAmountWhereSalesValueLowerThanAverage(sales);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getMonthsAmountWhereSalesValueHigherThanAverage(){
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedValue = 5;
        double actualValue = service.getMonthsAmountWhereSalesValueHigherThanAverage(sales);

        Assertions.assertEquals(expectedValue, actualValue);
    }
}
