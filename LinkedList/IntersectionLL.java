package DSA.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IntersectionLL {
    public static Node intersectionRef(Node headA, Node headB) {
        if (headA == null || headB == null)
            return null;

        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }

        return p1;
    }

    public static void main(String[] args) {
        Node common = new Node(30);
        common.next = new Node(40);
        common.next.next = new Node(50);

        // List A
        Node headA = new Node(10);
        headA.next = common;
        headA.next.next = new Node(40);

        // List B
        Node headB = new Node(5);
        headB.next = new Node(15);
        headB.next.next = common;

       Node ans = intersectionRef(headA, headB);

       if(ans != null){
        System.out.println(ans.data);
       } else {
        System.out.println("No Intersection");
       }
    }
}
