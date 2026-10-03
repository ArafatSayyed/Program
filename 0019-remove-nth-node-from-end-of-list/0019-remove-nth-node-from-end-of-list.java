class Solution
{
    public ListNode removeNthFromEnd(ListNode head, int k)
    {
        // int len = 0;
        // ListNode temp = head;
        // while (temp != null)
        // {
        //     temp = temp.next;
        //     len++;
        // }
        // temp = head;
        // if (len == k)
        // {
        //     return head.next;
        // }
        // for (int i = 1; i < len - k; i++)
        // {
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 1; i <= k; i++)
        {
            fast = fast.next;
        }    
        if (fast == null)
        {
            return head.next;
        }
        while (fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
