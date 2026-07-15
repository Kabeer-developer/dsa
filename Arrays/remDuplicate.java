import java.util.*;
public class remDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,5,6,4,6,2,9,7,4,3,8};
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
