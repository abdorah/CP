package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxProfitTransactions {

    public static int maxProfit(int[] prices) {
        List<Integer> pricesList = new ArrayList<Integer>();
        pricesList = IntStream.of(prices).boxed().collect(Collectors.toList());
        HashMap<List<Integer>, Integer> pricesHashMap = new HashMap<List<Integer>, Integer>();
        pricesHashMap = maxProfitByInterval(pricesList);
        int result = 0;
        if (pricesHashMap.size() < 1) {
            return result;
        } else if (pricesHashMap.size() == 1) {
            result = pricesHashMap.values().stream().mapToInt(v -> v).max().getAsInt();
            return result;
        } else {
            result = pricesHashMap.values().stream().mapToInt(v -> v).max().getAsInt();
            for (List<Integer> firstList : pricesHashMap.keySet()) {
                if (pricesHashMap.get(firstList) == result) {
                    pricesHashMap.remove(firstList);
                    break;
                }
            }
            result += pricesHashMap.values().stream().mapToInt(v -> v).max().getAsInt();
            return result;
        }
    }

    public static HashMap<List<Integer>, Integer> maxProfitByInterval(List<Integer> prices) {
        HashMap<List<Integer>, Integer> result = new HashMap<List<Integer>, Integer>();
        if (prices.size() == 1) {
            return result;
        } else {
            List<Integer> list = new ArrayList<Integer>();
            int profit = 0;
            int j = 0;
            for (int i = 0; i < prices.size() - 1; i++) {
                if (prices.get(i) > prices.get(i + 1)) {
                    list = prices.subList(j, i + 1);
                    profit = prices.get(i) - prices.get(j);
                    result.put(list, profit);
                    j = i + 1;
                }
            }
            if (j < prices.size() - 1) {
                int i = prices.size() - 1;
                list = prices.subList(j, i + 1);
                profit = prices.get(i) - prices.get(j);
                result.put(list, profit);
            }
            return result;
        }
    }
}