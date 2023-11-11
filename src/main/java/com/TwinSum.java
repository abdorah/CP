package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class TwinSum {

  /** This class has been added from leetcode to define the singly linked list. */
  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  /**
   * @param head
   * @return the maximum sum of pair numbers in the linked list head. You can find detailed
   *     explanaition of what are pair numbers in the related leetcode problem.
   */
  public static int pairSum(ListNode head) {
    ListNode acctual = head;
    List<Integer> values = new ArrayList<Integer>();
    while (acctual != null) {
      values.add(acctual.val);
      acctual = acctual.next;
    }
    int sum = 0;
    int best = 0;
    for (int i = 0; i < values.size() / 2; i++) {
      sum = values.get(i) + values.get(values.size() - 1 - i);
      if (sum > best) {
        best = sum;
      }
    }
    return best;
  }
}
