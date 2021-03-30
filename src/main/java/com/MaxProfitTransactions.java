package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class MaxProfitTransactions {

    public static int maxProfit(int[] prices) {
        List<Integer> pricesList = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int result = 0;
        boolean check = true;
        pricesList = IntStream.of(prices).boxed().collect(Collectors.toList());
        result = maxProfitOfOneTransaction(pricesList);

        if (result == 0) {
            return 0;
        } else {
            int length = pricesList.size() - maxProfitLatestInterval(pricesList).size();
            for (int i = 0; i <= length - 1; i++) {
                list.add(pricesList.get(i));
            }
            check = list.size() == 0 || list.size() == 1 || pricesList.size() - list.size() == 1 || list.size() == pricesList.size();
            if (!check) {
                result += maxProfitOfOneTransaction(list);
                return result;
            } else {
                return result;
            }
        }
    }

    public static int maxProfitOfOneTransaction(List<Integer> prices) {
        int max = 0;
        if (prices.size() == 1) {
            return 0;
        } else {
            for (int i = 0; i < prices.size() - 1; i++) {
                if (prices.get(i) > prices.get(i + 1)) {
                    max = Integer.max(max, Integer.max(prices.get(i) - prices.get(0),
                            maxProfitOfOneTransaction(prices.subList(i + 1, prices.size()))));
                }
            }
            max = Integer.max(max, prices.get(prices.size() - 1) - prices.get(0));
            return max;
        }
    }

    public static List<Integer> maxProfitLatestInterval(List<Integer> prices) {
        List<Integer> list = new ArrayList<Integer>();
        int i;

        if (prices.size() == 1) {
            return prices;
        }
        for (i = 0; i < prices.size() - 1; i++) {
            if (prices.get(i) > prices.get(i + 1) && prices.get(i) - prices.get(0) < 
            maxProfitOfOneTransaction(prices.subList(i + 1, prices.size()))) {
                list = prices.subList(i + 1, prices.size());
                break;
            } else {
                list = prices.subList(0, i);
            }
        }
        return list;
    }
}