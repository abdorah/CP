package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxProfitTransactions {

    public static int maxProfit(int[] prices) {
        List<Integer> pricesList = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        List<Integer> clean = new ArrayList<Integer>();
        int result = 0;
        boolean check = true;
        pricesList = IntStream.of(prices).boxed().collect(Collectors.toList());
        result = maxProfitOfOneTransaction(pricesList);
        temp = maxProfitLatestInterval(pricesList);
        clean = maxProfitCleaned(pricesList);
        if (result == 0) {
            return 0;
        } else {
            // int length = temp.get(temp.size() - 1);
            // for (int i = 0; i < pricesList.size(); i++) {
            //     // list.add(pricesList.get(i));
            //     if (i > length) {
            //         list.add(pricesList.get(i));
            //     }
            // }
            result = result < maxProfitOfOneTransaction(clean) ? result : result + maxProfitOfOneTransaction(clean) ;
            return result;
            // check = list.size() == 0 || list.size() == 1 || pricesList.size() - list.size() == 1 || list.size() == pricesList.size();
            // if (!check) {
            //     result += maxProfitOfOneTransaction(list);
            //     return result;
            // } else {
            //     return result;
            // }
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
        int i;

        if (prices.size() == 1) {
            return prices;
        }
        for (i = 0; i < prices.size() - 1; i++) {
            if (prices.get(i) >= prices.get(i + 1) && prices.get(i) - prices.get(0) <= 
            maxProfitOfOneTransaction(prices.subList(i + 1, prices.size()))) {
                list = prices.subList(i + 1, prices.size());
                break;
            } else {
                list = prices.subList(0, i);
            }
        }
        return list;
    }

    public static List<Integer> maxProfitCleaned(List<Integer> prices) {
        List<Integer> list = new ArrayList<Integer>();

        String pricess = prices.stream().map((m)->{
            return Integer.toString(m);
        }).reduce((p,n)->{
            return p + n;
        }).get();
        String mplis = maxProfitLatestInterval(prices).stream().map((m)->{
            return Integer.toString(m);
        }).reduce((p,n)->{
            return p + n;
        }).get();

        for (String c : pricess.split(mplis)[0].split("")) {
            list.add(Integer.parseInt(c));
        }

        return list;
    }
}


// List<Integer> list = new ArrayList<Integer>();
// int i;

// if (prices.size() == 1) {
//     return prices;
// }
// for (i = 0; i < prices.size() - 1; i++) {
//     if (!(prices.get(i) > prices.get(i + 1) && prices.get(i) - prices.get(0) < maxProfitOfOneTransaction(prices.subList(i + 1, prices.size())))) {
//         list = prices.subList(i + 1, prices.size());
//     } else {
//         list = prices.subList(0, i);
//         break;
//     }
// }
// return list;