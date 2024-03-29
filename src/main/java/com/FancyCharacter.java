package com;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class FancyCharacter {

  /**
   * @param s
   * @return Fancy string of s
   */
  public static String makeFancyString(String s) {
    StringBuilder str = new StringBuilder(s);
    for (int i = 0; i < str.length(); ) {
      if (i + 1 < str.length() && str.charAt(i + 1) == str.charAt(i)) {
        while (i + 2 < str.length() && str.charAt(i + 2) == str.charAt(i)) {
          str.deleteCharAt(i + 2);
        }
        i += 2;
      } else {
        ++i;
      }
    }
    return str.toString();
  }
}
