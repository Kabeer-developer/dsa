import java.util.Arrays;

public class consecutiveSequence{
    public static void main(String[] args) {
        int[] arr = {1,2,100,200,101,3,4};
        Arrays.sort(arr);
        int result =0;
        int count=1;
        if(arr.length==1){
            System.out.println(count);
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] == 1){
                count++;
                if(count>result){
                    result=count;
                }
            } else {
                count=1;
            }
        }
        System.out.println(result);
    }
}