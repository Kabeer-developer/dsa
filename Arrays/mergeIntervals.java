import java.util.ArrayList;
import java.util.Arrays;

public class mergeIntervals{
    public static void main (String[] args){
        int[][] arr = {
            {1,2},
            {2,3},
            {4,5},
            {6,7},
            {6,10}
        };
       Arrays.sort(arr,(a,b)-> a[0]-b[0]);

       ArrayList<int[]> ans = new ArrayList<>();

       int start = arr[0][0];
       int end = arr[0][1];

       for(int i=1;i<arr.length;i++){
        if(arr[i][0]<=end){
            end = Math.max(end,arr[i][1]);
        } else {
            ans.add(new int[]{start,end});
            start = arr[i][0];
            end=arr[i][1];
        }
       }
       ans.add(new int[]{start,end});

       for(int[] x: ans){
        System.out.println(Arrays.toString(x));
       }
    }
}