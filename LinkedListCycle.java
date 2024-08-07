/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public boolean hasCycle(ListNode head) {
        Set<Integer> values = new HashSet<>();


        while(head != null){
            if(values.contains(head.val)){
                return true;
            }
            values.add(head.val);
            head = head.next;
        }
        return false;
    }
}
