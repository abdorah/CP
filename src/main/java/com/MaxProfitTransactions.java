package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxProfitTransactions {

    public static int maxProfit(int[] prices) {
        List<Integer> pricesList = new ArrayList<Integer>();
        List<Integer> clean = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        int result = 0;
        pricesList = IntStream.of(prices).boxed().collect(Collectors.toList());
        result = maxProfitOfOneTransaction(pricesList);
        temp = maxProfitLatestInterval(pricesList);
        clean = maxProfitCleaned(pricesList);
        if (result == 0) {
            return 0;
        } else {
            if (result != temp.get(temp.size() - 1) - temp.get(0)) {
                result = temp.get(temp.size() - 1) - temp.get(0);
            }
            result = 0 < maxProfitOfOneTransaction(clean) ? result + maxProfitOfOneTransaction(clean) : result;
            return result;
        }
    }

    public static int maxProfitOfOneTransaction(List<Integer> prices) {
        int max = 0;
        if (prices.size() == 1 || prices.isEmpty()) {
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
        int max = maxProfitOfOneTransaction(prices);
        int j = 0;
        if (prices.size() == 1 || max == 0) {
            return prices;
        }
        for (int i = 0; i < prices.size() - 1; i++) {
            if (prices.get(i) > prices.get(i + 1) && i + 1 < prices.size() - 1) {
                if (max == prices.get(i) - prices.get(j)) {
                    list = prices.subList(j, i + 1);
                    break;
                } else {
                    j = i + 1;
                }
            }
            if (i + 1 == prices.size() - 1) {
                if (prices.get(i) > prices.get(i + 1)) {
                    list = prices.subList(j, i + 1);
                } else {
                    list = prices.subList(j, i + 2);
                }
                break;
            }
        }
        return list;
    }

    public static List<Integer> maxProfitCleaned(List<Integer> prices) {
        List<Integer> list = new ArrayList<Integer>();

        if (prices.size() <= 1) {
            return prices;
        } else {
            String pricess = prices.stream().map((m) -> {
                return Integer.toString(m);
            }).reduce((p, n) -> {
                return p + n;
            }).get();
            String mplis = maxProfitLatestInterval(prices).stream().map((m) -> {
                return Integer.toString(m);
            }).reduce((p, n) -> {
                return p + n;
            }).get();
            if (pricess.equals(mplis)) {
                return new ArrayList<Integer>();
            } else {
                for (String c : pricess.split(mplis)) {
                    if (pricess.split(mplis).length >= 1 && pricess.split(mplis)[0].length() <= 1) {
                        continue;
                    } else {
                        for (String v : c.split("")) {
                            if (!v.equals("")) {
                                list.add(Integer.parseInt(v));
                            }
                        }
                    }
                }
                return list;
            }
        }
    }
}