package lesson4.linkedlistcycle;

import java.util.HashSet;
import java.util.Set;

public class ListCycleUtil {

    public static <T> boolean checkListFoCycleViaSet(ListNode<T> head) {
        Set<ListNode<T>> uniqueNodes = new HashSet<ListNode<T>>();
        while(head.getNext() != null) {
            if (!uniqueNodes.add(head)) {
                return true;
            };
            head = head.getNext();
        }
        return false;
    }

    public static <T> boolean checkListFoCycleViaFloydAlgorithm(ListNode<T> head) {
        ListNode<T> slow = head;
        ListNode<T> fast = head;

        while(fast.getNext() != null && fast.getNext().getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            System.out.print(fast.getValue() + "-");
            System.out.print(slow.getValue());
            System.out.println();

            if (fast.equals(slow)) {
                return true;
            }
        }
        return false;
    }
}
