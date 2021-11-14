package com;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class AlmostEquivalentString {

  /**
   * @param word
   * @param search
   * @return the numbre of occurences of the String search in the String word
   */
  public static int numberOfOccurence(String word, String search) {
    int count = 0;
    for (int i = 0; i < word.length(); i++) {
      if (Character.toString(word.charAt(i)).equals(search.toString())) count++;
    }
    return count;
  }

  /**
   * @param word1
   * @param word2
   * @return tell if the two Strings word1 and word2 are almost equivalent. Therefore, it returns
   *     true only if for each character in those two the difference between the number of occurence
   *     of each one of them is at most three.
   */
  public static boolean checkAlmostEquivalent(String word1, String word2) {
    String[] alphabet =
        new String[] {
          "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
          "s", "t", "u", "v", "w", "x", "y", "z"
        };
    for (String s : alphabet) {
      if (Math.abs(numberOfOccurence(word1, s) - numberOfOccurence(word2, s)) > 3) {
        return false;
      }
    }
    return true;
  }
}
