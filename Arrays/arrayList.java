import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.remove(list.size()-1);
        list.remove(0);
        list.add(10);
        list.add(0,9);
        System.out.println(list);

    }
}
