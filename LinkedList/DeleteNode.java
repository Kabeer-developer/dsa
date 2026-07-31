package DSA.LinkedList;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next = null;
    }
}

public class DeleteNode {

    public static Node delElementByValue(Node head,int value){
        if(head == null){
            return null;
        }

        if(head.data == value){
            head = head.next;
        }
        Node temp = head;

        while(temp.next != null && temp.next.data != value){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
    }
       public static Node delElementByPosition(Node head,int position){
        if(head == null){
            return null;
        }

        if(position==0){
            head = head.next;
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

        Node temp = head;
        System.out.println("All elements");
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

         // delete first element
        Node first = head.next;
        System.out.println("Delete first element");
        while(first !=null){
            System.out.println(first.data);
            first = first.next;
        }

        // delete last element
        Node last = head;
        System.out.println("Delete last element");
        while(last.next !=null){
            System.out.println(last.data);
            last = last.next;
        }

        // delete by value
        System.out.println("Deleted by value");
        Node start = delElementByValue(head, 20);
        printList(start);

        //delete by position
        System.out.println("Delete by Position");
        Node start1 = delElementByPosition(head, 0);
        printList(start1);
        
    }
}
