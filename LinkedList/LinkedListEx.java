package DSA.LinkedList;
import java.util.LinkedList;
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        System.out.println(list.get(0));
        list.addFirst(20);
        list.addLast(30);
        list.set(2, 40);
        list.remove(0);
        list.remove(Integer.valueOf(40));
        list.add(99);
        list.removeFirst();
        System.out.println(list.getFirst());
        System.out.println(list);
        for(int l : list){
            System.out.println(l);
        }
    }
}
