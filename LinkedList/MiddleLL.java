package DSA.LinkedList;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next = null;
    }
}
public class MiddleLL {
    public static Node middleOfLinkedList(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node secNode = new Node(20);
        Node thiNode = new Node(30);
        Node foNode = new Node(40);
        thiNode.next = foNode;
        head.next = secNode;
        secNode.next = thiNode;

        Node middle = middleOfLinkedList(head);
        System.out.println(middle.data);
    }
}
