package LeetCode;

public class MergeTwoSortedLL {
    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(1, node2);

        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(3, node4);
        ListNode node6 = new ListNode(1, node5);

        ListNode res = s.mergeTwoLists(node3, node6);
        ListNode start = res;
        while (start != null) {
            System.out.print(start.val + " ");
            start = start.next;
        }
        System.out.println();
    }

    static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode node = new ListNode(0);
            ListNode current = node;
            ListNode temp1 = l1, temp2 = l2;

            while (temp1 != null && temp2 != null) {
                if (temp1.val < temp2.val) {
                    current.next = temp1;
                    temp1 = temp1.next;
                } else {
                    current.next = temp2;
                    temp2 = temp2.next;
                }
                current = current.next;
            }

            current.next = (temp1 != null) ? temp1 : temp2;
            return node.next;
        }
    }
}
