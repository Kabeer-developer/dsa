package DSA.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MergeLL{
    public static Node merge(Node head,Node head2){
        if(head == null) return head2;
        if(head2 == null) return head;

        if(head.data <= head2.data){
            head.next = merge(head.next, head2);
            return head;
        } else {
            head2.next = merge(head, head2.next);
            return head2;
        }
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args){
        Node head1 = new Node(10);
        Node sNode1 = new Node(20);
        Node tNode1 = new Node(40);
        Node fNode1 = new Node(60);
        head1.next = sNode1;
        sNode1.next = tNode1;
        tNode1.next = fNode1;

        Node head2 = new Node(5);
        Node sNode2 = new Node(30);
        Node tNode2 = new Node(70);
        Node fNode2 = new Node(80);
        head2.next = sNode2;
        sNode2.next = tNode2;
        tNode2.next = fNode2;

        Node rHead = merge(head1, head2);
        printList(rHead);
    }
}