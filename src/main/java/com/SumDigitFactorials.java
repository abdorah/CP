package com;

import java.util.HashMap;
import java.util.stream.LongStream;

public class SumDigitFactorials {

  public static long sFunction(long number) {
    long digit = 0;
    long sum = 0;
    while (number > 0) {
      digit = number % 10;
      sum = sum + digit;
      number = number / 10;
    }
    return sum;
  }

  public static long fFunction(long number) {
    long digit = 0;
    long sum = 0;
    while (number > 0) {
      digit = number % 10;
      sum = sum + LongStream.rangeClosed(1, digit).reduce(1, (long a, long b) -> a * b);
      number = number / 10;
    }
    return sum;
  }

  public static long gFunction(long number) {
    return 0;
  }

  public static long sumSG(HashMap<Long, Long> numbers, long queue) {
    return 0;
  }
}
