import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.set(0, 20);
        list.add(0,30);
        list.remove(1);
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println(list.size());

    }
}
