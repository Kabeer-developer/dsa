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
    public static Node delElementByPosition(Node head,int position){
        if(head == null){
            return null;
        }

        if(position==0){
            return head.next;
        }
        Node temp = head;

        for(int i=0;i<position-1 && temp.next!=null;i++){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
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

        Node rHead = delElementByPosition(head, 0);
        printList(rHead);
    }
}
