package com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        return Stream.iterate(1, i -> ++i).limit(n).map(e -> {
            return e % 5 == 0 ? "Fizz" + ("" + (e % 3 == 0 ? "Buzz" : "")) : ("" + (e % 3 == 0 ? "Buzz" : e));
        }).collect(Collectors.toList());
    }
}