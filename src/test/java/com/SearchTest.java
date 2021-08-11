package com;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see Search.suggestedProducts
 */

public class SearchTest {

    @Test
    public void shouldAnswerWithTrue() {
        String[] products = { "havana" };
        List<String> listOfProducts = List.of("havana");
        List<List<String>> expecteds = List.of(listOfProducts, listOfProducts, listOfProducts, listOfProducts,
                listOfProducts);
        List<List<String>> actuals = Search.suggestedProducts(products, "havana");
        for (int i = 0; i < expecteds.size(); i++) {
            assertTrue(expecteds.get(i).equals(actuals.get(i)));
        }
    }
}