package com;

import java.util.Arrays;
import java.util.List;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class CapitilizedString {

    /**
     * @param title
     * @return return the string title capitalized. This means that the first letter of each word is a capital letter.
     * Only if the word's lenght is 2 or less, then it will be all in lower case.
     */
    public static String capitalizeTitle(String title) {
        List<String> l = Arrays.asList(title.split(" ")).stream().map((e) -> {
            String v = "";
            v = e.toLowerCase();
            if(e.length()> 2){
                v = v.substring(0, 1).toUpperCase() + v.substring(1);
            }
            return v;
        }).toList();
        String o = "";
        for (String s : l) {
            o = o + " " + s;
        }
        return o.trim();
    }
}