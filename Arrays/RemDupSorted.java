public class RemDupSorted {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,5,5,6,7};
        int k=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
            
        }
     System.out.println(k);
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
    }
}
