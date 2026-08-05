import java.util.Arrays;
import java.util.HashSet;

public class singleNum {
    public static void main(String[] args) {
        int[] arr = {1,7,7,7,8,9,9,2,3,4,4,5,5};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(!seen.contains(arr[i])){
                seen.add(arr[i]);
            } else {
                duplicate.add(arr[i]);
            }
        }

        for(int i=0;i<arr.length;i++){
            if(!duplicate.contains(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
