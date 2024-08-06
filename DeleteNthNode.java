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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0, nodeFromBeginning = 0;
        ListNode temp = head;
        ListNode prevTemp = null;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        System.out.println("length : " + length);
        nodeFromBeginning = length - n + 1;
        System.out.println("nodeFromBeginning : " + nodeFromBeginning);
        temp = head;
        for(int i=1; i < nodeFromBeginning; i++){
            prevTemp = temp;
            temp = temp.next;
        }
        System.out.println("temp val : " + temp.val);
        if(prevTemp == null) {
            head = head.next;
            return head;
        }else{
            prevTemp.next = temp.next;
            return head;
        }
    }
}
