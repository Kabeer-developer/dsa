package DSA.LinkedList;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteFromEnd {
    public static Node deleteFromEnd(Node head, int position) {
    if (head == null) return null;

    Node fast = head;
    Node slow = head;

    // Move fast position + 1 steps
    for (int i = 0; i <= position; i++) {
        if (fast == null) {
            return head; // Position is greater than list length
        }
        fast = fast.next;
    }

    // Delete head if needed
    if (fast == null) {
        return head.next;
    }

    while (fast.next != null) {
        fast = fast.next;
        slow = slow.next;
    }

    slow.next = slow.next.next;

    return head;
}
public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node rHead = deleteFromEnd(head, 0);
        printList(rHead);
    }
}
