class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        // Middle Node
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow; // middle node
        ListNode prev = null;

        // reversing the second half list
        while(curr!=null){
            ListNode nextN = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextN;
        }

        // let's compare the first and second half each values
        // whether they are equal or not

        ListNode p1 = head;
        ListNode p2 = prev;

        while(p1!=null && p2!=null){
            if(p1.val!=p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;

    }
}