public class AllSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int size =1;
        for(int l=0;l<arr.length;l++){
        for(int i=0;i<=arr.length-size;i++){
            for(int j=i;j<i+size;j++){
                System.out.print(arr[j]);
            }
            System.out.println();
           
        }
         if(size==arr.length) return;
            size++;
    }
    }   
}
