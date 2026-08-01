import java.util.*;
public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] arr = {3,4,1,9,56,7,9,12};
        int students = 5;
        Arrays.sort(arr);
        int min = arr[arr.length-1]-arr[0];

        for(int i=0;i<=arr.length-students;i++){
            int diff = arr[i+students-1] - arr[i];
            min = Math.min(diff,min);
        }
        System.out.println(min);
    }
}
