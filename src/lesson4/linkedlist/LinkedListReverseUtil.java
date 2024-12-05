package lesson4.linkedlist;

import java.util.LinkedList;

public class LinkedListReverseUtil {
    public static <T> ListNode<T> reverseLinkedList(ListNode<T> head) {
        ListNode<T> current = head;
        ListNode<T> previous = null;

        while(current != null) {
            //link to natural order next element
            ListNode<T> next = current.getNext();
            current = current.getNext();
            current.setNext(previous);
        }

        return current;
    }
}
