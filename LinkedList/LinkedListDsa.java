package DSA.LinkedList;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListDsa {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        first.next = second;
        Node third = new Node(30);
        second.next = third;

        Node head = new Node(50);
        head.next = new Node(60);
        head.next.next = new Node(70);

        Node temp = first;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
