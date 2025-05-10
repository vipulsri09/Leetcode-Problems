class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(0);
        ListNode temp3 = list3;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                temp3.next = list1;
                list1 = list1.next;
            }else{
                temp3.next = list2;
                list2 = list2.next;
            }
            temp3 = temp3.next;
        }

        if(list1!=null)
            temp3.next = list1;
        else
            temp3.next = list2;

        return list3.next;

    }
}