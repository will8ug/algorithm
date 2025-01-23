package io.will.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTest {
    //int[] stocks = {20, 60, 10, 100, 200, 30, 5, 300};

    @Test
    public void testEmptyInput() {
        int[] stocks = {};
        StockExchangeOption option = compute(stocks);

        assertEquals(0, option.buy());
        assertEquals(0, option.sell());
        assertEquals(0, option.profit());
    }

    @Test
    public void testTwoElements() {
        int[] stocks = {20, 60};
        StockExchangeOption option = compute(stocks);

        assertEquals(20, option.buy());
        assertEquals(60, option.sell());
        assertEquals(40, option.profit());
    }

    @Test
    public void testThreeElements() {
        int[] stocks = {20, 60, 10};
        StockExchangeOption option = compute(stocks);

        assertEquals(10, option.buy());
        assertEquals(60, option.sell());
        assertEquals(50, option.profit());
    }

    @Test
    public void testFullElements() {
        int[] stocks = {20, 60, 10, 100, 200, 30, 5, 300};
        StockExchangeOption option = compute(stocks);

        assertEquals(5, option.buy());
        assertEquals(300, option.sell());
        assertEquals(295, option.profit());
    }

    private StockExchangeOption compute(int[] stocks) {
        if (stocks.length == 0) {
            return new StockExchangeOption(0, 0, 0);
        }

        int smallest = stocks[0];
        int largest = stocks[0];
        for (int num : stocks) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        return new StockExchangeOption(smallest, largest, largest - smallest);
    }
}
