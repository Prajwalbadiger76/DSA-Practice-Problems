package List_Problems;

public class IntersectionOfLinkedLists {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null)
            return null;

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        return pA;
    }

    public static void main(String[] args) {

        // Common part
        ListNode common1 = new ListNode(8);
        ListNode common2 = new ListNode(4);
        ListNode common3 = new ListNode(5);

        common1.next = common2;
        common2.next = common3;

        // List A
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common1;

        // List B
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common1;

        ListNode intersection = getIntersectionNode(headA, headB);

        if (intersection != null)
            System.out.println("Intersection at node value: " + intersection.val);
        else
            System.out.println("No intersection");
    }
}