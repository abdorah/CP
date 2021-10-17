package com;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class PhoneNumber {

  /**
   * @param numbers
   * @return formatted String of phone number based on the given numbers
   */
  public static String createPhoneNumber(int[] numbers) {
    StringBuilder strb = new StringBuilder();
    strb.append("(");
    strb.append(numbers[0]);
    strb.append(numbers[1]);
    strb.append(numbers[2]);
    strb.append(")");
    strb.append(" ");
    strb.append(numbers[3]);
    strb.append(numbers[4]);
    strb.append(numbers[5]);
    strb.append("-");
    strb.append(numbers[6]);
    strb.append(numbers[7]);
    strb.append(numbers[8]);
    strb.append(numbers[9]);
    return strb.toString();
  }
}
