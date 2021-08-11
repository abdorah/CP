package com;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see FizzBuzz.fizzBuzz
 */

public class FizzBuzzTest {

    @Test
    public void shouldAnswerWithTrue()
    {  
        List<String> expecteds = List.of("1","2","Buzz","4","Fizz","Buzz","7","8","Buzz","Fizz","11","Buzz","13","14","FizzBuzz");
        List<String> actuals = FizzBuzz.fizzBuzz(15);
        for (int i = 0; i < 15; i++) {
            assertTrue(expecteds.get(i).equals(actuals.get(i)));
        }
    }
}