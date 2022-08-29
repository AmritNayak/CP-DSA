package LeetCode;

import java.util.List;

public class LLAddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode();
        ListNode s1 = l1;
        for (int i = 1; i <= 7; i++) {
            s1.next = new ListNode(9);
            s1 = s1.next;
        }
        ListNode l2 = new ListNode();
        ListNode s2 = l2;
        for (int i = 1; i <= 4; i++) {
            s2.next = new ListNode(9);
            s2 = s2.next;
        }

        ListNode res = solution.addTwoNumbers(l1.next, l2.next);
        display(res);
        System.out.println();
    }

    static void display(ListNode node) {
        ListNode dummy = node;
        while (dummy != null) {
            System.out.print(dummy.val + " ");
            dummy = dummy.next;
        }
    }

    static class ListNode {    int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode res = new ListNode(0);
            ListNode start = res;
            boolean carry = false;

            while (l1 != null && l2 != null) {
                int temp = l1.val + l2.val;
                if (carry)
                    temp += 1;
                carry = temp > 9;
                start.next = new ListNode(temp % 10);
                start = start.next;

                l1 = l1.next;
                l2 = l2.next;
            }

            ListNode temp = (l1 != null) ? l1 : l2;
            if (carry) {
                start.next = addTwoNumbers(temp, new ListNode(1));
            } else
                start.next = temp;
            return res.next;
        }
    }
}



