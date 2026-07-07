import java.util.Scanner;

public class checkSorted {
    public static boolean checkSortedArr(int[] arr){
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
            }
        }
        return isSorted;
    }
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];

       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
        sc.close();
      
       System.out.println(checkSortedArr(arr));
       
      
    }
}
