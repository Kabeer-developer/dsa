import java.util.*;
public class chocolateDistribution {
    public static void main(String[] args) {
        int[] arr = {3,4,1,9,56,7,9,12};
        
        int students=5;
        Arrays.sort(arr);
        int result = arr[arr.length-1]-arr[0];
        for(int i=0;i<arr.length-students;i++){
            int min =arr[i+students-1]-arr[i];
            result = Math.min(result,min);
        }
        System.out.println(result);
    }
}
