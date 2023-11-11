package com;

import java.util.Arrays;
import java.util.List;

/**
 * Snowflake
 *
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see <a href="https://leetcode.com/problems/capitalize-the-title/"><b>Leetcode-2129. Capitalize
 *     the Title</b></a>
 */
public class CapitilizedString {

  /**
   * @param title The input string to be capitalized.
   * @return The string title capitalized. This means that the first letter of each word is a
   *     capital letter. Only if the word's lenght is 2 or less, then it will be all in lower case.
   */
  public static String capitalizeTitle(String title) {
    List<String> l =
        Arrays.asList(title.split(" ")).stream()
            .map(
                (e) -> {
                  String v = "";
                  v = e.toLowerCase();
                  if (e.length() > 2) {
                    v = v.substring(0, 1).toUpperCase() + v.substring(1);
                  }
                  return v;
                })
            .toList();
    String o = "";
    for (String s : l) {
      o = o + " " + s;
    }
    return o.trim();
  }
}
