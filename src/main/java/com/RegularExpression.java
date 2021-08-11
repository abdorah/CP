package com;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class RegularExpression {

    /**
     * @param text
     * @param pattern
     * @return true if text match pattern and false otherwise
     */
    public static boolean isMatch(String text, String pattern) {

        if (pattern.isEmpty())
            return text.isEmpty();
        
        boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return (isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }
}