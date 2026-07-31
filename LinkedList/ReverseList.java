package DSA.LinkedList;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next = null;
    }
}
public class ReverseList {
    public static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;

        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
     public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printList(head);
        System.out.println();
        Node newHead = reverseList(head);
        printList(newHead);
    }
}
