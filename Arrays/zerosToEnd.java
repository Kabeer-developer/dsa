public class zerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,0,4,0};
        int count =0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] !=0){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        int zeroCount = n-count;
        for(int i=0;i<zeroCount;i++){
            System.out.print(0+ " ");
        }
    }
}
