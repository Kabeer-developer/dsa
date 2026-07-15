
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest =arr[0];
        int sLargest =arr[0];
        int tLargest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                tLargest = sLargest;
                sLargest = largest;
                largest = arr[i];
            }
            if(sLargest < arr[i] && arr[i]!= largest){
                tLargest = sLargest;
                sLargest = arr[i];
            }
             if(tLargest < arr[i] && arr[i]!= largest && arr[i]<sLargest){
                tLargest = arr[i];
            }
            
        }
        System.out.print(tLargest+" "+largest+" "+sLargest);
      sc.close();
    }
}