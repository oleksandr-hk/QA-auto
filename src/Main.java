import lesson4.linkedlist.LinkedListReverseUtil;
import lesson4.linkedlist.ListNode;
import lesson4.string.StringUtil;

public class Main {
    public static void main(String[] args) {
        ListNode<Integer> firstNode = new ListNode<Integer>(1);
        ListNode<Integer> secondNode = new ListNode<Integer>(2);
        ListNode<Integer> thirdNode = new ListNode<Integer>(3);
        ListNode<Integer> fourthNode = new ListNode<Integer>(4);
        ListNode<Integer> fifthNode = new ListNode<Integer>(5);

        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        thirdNode.setNext(fourthNode);
        fourthNode.setNext(fifthNode);

        LinkedListReverseUtil.reverseLinkedList(firstNode);


    }
}