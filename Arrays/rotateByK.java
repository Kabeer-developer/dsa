public class rotateByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=3;
        int[] result = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            // right rotate
            // result[(i+k)%arr.length] = arr[i]; // 3 4 5 1 2
            // left rotate
            result[i]=arr[(i+k)%arr.length];  // 4 5 1 2 3
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    
         }
}
