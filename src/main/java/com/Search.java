package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    var results = new ArrayList<List<String>>();
    Arrays.sort(products);
    results.add(
        Arrays.stream(products).filter((e) -> e.indexOf(searchWord.charAt(0)) == 0).toList());
    for (i = 1; i < searchWord.length(); i++) {
      results.add(
          results.get(i - 1).stream()
              .filter(e -> (i < e.length()) && e.charAt(i) == searchWord.charAt(i))
              .toList());
    }
    return results.stream().map((e) -> e.stream().limit(3).toList()).toList();
  }
}
