package com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class FizzBuzz {

  /**
   * @param n
   * @return list of strings: buzz if the index is divided by 5, fizz for three and fizzbuzz for 5
   *     and 3
   */
  public static List<String> fizzBuzz(int n) {
    return Stream.iterate(1, i -> ++i)
        .limit(n)
        .map(
            e -> {
              return e % 3 == 0
                  ? "Fizz" + ("" + (e % 5 == 0 ? "Buzz" : ""))
                  : ("" + (e % 5 == 0 ? "Buzz" : e));
            })
        .collect(Collectors.toList());
  }
}
