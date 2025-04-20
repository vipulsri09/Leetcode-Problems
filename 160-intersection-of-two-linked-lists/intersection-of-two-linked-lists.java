public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> st = new HashSet<>();

        ListNode l1 = headA;
        ListNode l2 = headB;

        while (l1 != null) {
            st.add(l1);
            l1 = l1.next;
        }

        while (l2 != null) {
            if (st.contains(l2)) {
                return l2;
            }
            l2 = l2.next;
        }

        return null;
    }
}