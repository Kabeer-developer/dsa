import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6,7};
       HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            if(!set1.contains(arr1[i])){
                set1.add(arr1[i]);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(set1.contains(arr2[i]) && !set2.contains(arr2[i])){
                set2.add(arr2[i]);
                list.add(arr2[i]);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
       System.out.println(Arrays.toString(result));
    }
}
