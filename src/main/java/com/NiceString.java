package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class NiceString {

  /**
   * @param s
   * @return the longest sub-string out of a s
   */
  public static String longestNiceSubstring(String s) {

    var allLowers = new HashSet<String>();
    var allUppers = new HashSet<String>();
    var differences = new HashSet<String>();
    var buffer = new ArrayList<String>();

    if (s.length() <= 1) {
      return "";
    } else if (!isNotNice(s)) {
      return s;
    } else {
      for (var c : s.split("")) {
        if (c.toLowerCase().compareTo(c) == 0) {
          allLowers.add(c);
        }
        if (c.toUpperCase().compareTo(c) == 0) {
          allUppers.add(c);
        }
      }
      for (var c : allLowers) {
        if (!allUppers.contains(c.toUpperCase())) {
          differences.add(c);
        }
      }
      for (var c : allUppers) {
        if (!allLowers.contains(c.toLowerCase())) {
          differences.add(c);
        }
      }
      if (differences.isEmpty()) {
        return s;
      } else if (differences.size() == s.length()) {
        return "";
      } else {
        for (var c : differences) {
          buffer.addAll(Arrays.asList(s.split(c)));
          buffer =
              new ArrayList<String>(buffer.stream().map(e -> longestNiceSubstring(e)).toList());
          s = buffer.stream().max(Comparator.comparing(e -> e.length())).orElse("");
          buffer.clear();
          buffer.add(s);
          buffer.removeIf(e -> isNotNice(e));
        }
      }
      return longestNiceSubstring(s);
    }
  }

  static boolean isNotNice(String s) {
    var allLowers = new HashSet<String>();
    var allUppers = new HashSet<String>();
    var differences = new HashSet<String>();

    if (s.length() <= 1) {
      return true;
    }
    for (var c : s.split("")) {
      if (c.toLowerCase().compareTo(c) == 0) {
        allLowers.add(c);
      }
      if (c.toUpperCase().compareTo(c) == 0) {
        allUppers.add(c);
      }
    }
    for (var c : allLowers) {
      if (!allUppers.contains(c.toUpperCase())) {
        differences.add(c);
      }
    }
    for (var c : allUppers) {
      if (!allLowers.contains(c.toLowerCase())) {
        differences.add(c);
      }
    }
    if (differences.isEmpty()) {
      return false;
    } else {
      return true;
    }
  }
}
