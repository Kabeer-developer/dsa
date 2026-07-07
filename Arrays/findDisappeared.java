import java.util.Arrays;

public class findDisappeared {
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,8,6,7,9,15,13};
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]>1){
                for(int j=arr[i]+1;j<arr[i+1];j++){
                    System.out.println(j);
                }
            }
        }
    }
}
