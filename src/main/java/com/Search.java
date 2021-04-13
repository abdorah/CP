package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Search {

    static int i;

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        var res = new ArrayList<List<String>>();
        Arrays.sort(products);
        var targetList = Arrays.asList(products);
        res.add(targetList.stream().filter((e) -> e.indexOf(searchWord.charAt(0)) == 0).collect(Collectors.toList()));
        for (i = 1; i < searchWord.length(); i++) {
            res.add(res.get(i - 1).stream().filter(e -> (i < e.length()) && e.charAt(i) == searchWord.charAt(i))
                    .collect(Collectors.toList()));
        }
        return res.stream().map((e) -> e.stream().limit(3).collect(Collectors.toList())).collect(Collectors.toList());
    }
}