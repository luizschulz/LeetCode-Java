
//Definition for singly-linked list.
// public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(0);
        ListNode resultNode = prehead;

        int add = 0;
        int sum = 0 ;

        while(l1 != null || l2 != null || add!= 0){
            if(l1 == null && l2==null){
                sum = add;
                add = 0;

            }
            else if(l1 == null){
                sum = l2.val + add;
                add = sum/10;
                l2 = l2.next;

            }
            else if(l2 == null){
                sum = l1.val + add;
                add = sum/10;
                l1 = l1.next;

            }
            else{
                sum = l1.val + l2.val + add;
                add = sum/10;
                l1 = l1.next;
                l2 = l2.next;
            }
            ListNode newNode = new ListNode(sum%10);
            resultNode.next = newNode;
            resultNode = resultNode.next;

        }
        return prehead.next;
    }
}
