package lesson6.linkedlist;

import lesson4.linkedlist.ListNode;

public class ReverseLinkedListUtil {

    public static <T> ListNode<T> reverseList(ListNode<T> headNode) {
        if (headNode == null) {
            return null;
        }
        ListNode<T> previous = null;
        ListNode<T> current = headNode;
        ListNode<T> next;
        while(current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;

    }
}
