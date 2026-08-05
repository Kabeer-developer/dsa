
import java.util.*;
class secondLar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest =Integer.MIN_VALUE;
        int sLargest =Integer.MIN_VALUE;
        int tLargest = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                tLargest = sLargest;
                sLargest = largest;
                largest = arr[i];
            } 

            if(arr[i] != largest && arr[i] > sLargest){
                tLargest=sLargest;
                sLargest=arr[i];
            }

            if(arr[i] > tLargest && arr[i]!=sLargest && arr[i]!= largest){
                tLargest = arr[i];
            }

        }

        System.out.println(largest+" "+sLargest+" "+tLargest);
      sc.close();
    }
}