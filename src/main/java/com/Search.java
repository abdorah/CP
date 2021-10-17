package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class Search {

  /**
   * @see suggestedProducts method to inderstand why we need i to be static So that we can access
   *     values from within a stream
   */
  static int i;

  /**
   * @param products
   * @param searchWord
   * @return return a list of ordred strings, which are search results of the pattern searchWord in
   *     products
   */
  public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
    var res = new ArrayList<List<String>>();
    Arrays.sort(products);
    var targetList = Arrays.asList(products);
    res.add(
        targetList.stream()
            .filter((e) -> e.indexOf(searchWord.charAt(0)) == 0)
            .collect(Collectors.toList()));
    for (i = 1; i < searchWord.length(); i++) {
      res.add(
          res.get(i - 1).stream()
              .filter(e -> (i < e.length()) && e.charAt(i) == searchWord.charAt(i))
              .collect(Collectors.toList()));
    }
    return res.stream()
        .map((e) -> e.stream().limit(3).collect(Collectors.toList()))
        .collect(Collectors.toList());
  }
}
