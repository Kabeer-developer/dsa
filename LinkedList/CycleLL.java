package DSA.LinkedList;
  class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next = null;
    }
}
public class CycleLL {

    public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node secNode = new Node(20);
        Node thiNode = new Node(30);
        Node foNode = new Node(40);
        foNode.next = secNode;
        // cycle linking
        thiNode.next = foNode;
        head.next = secNode;
        secNode.next = thiNode;

        System.out.println(hasCycle(head));
}}
