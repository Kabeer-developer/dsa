public class maxProductSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,4,5};
        int max =0;
        int product =1;
        int start=0;
        int ansStart=0;
        int ansEnd =0;

        for(int i=0;i<arr.length;i++){
            product*=arr[i];
            if(product>max){
                max = product;
                ansStart=start;
                ansEnd  =i;
            } else if(product<0){
                product=0;
                start=i+1;
            }
        }

        System.out.println(max);
        for(int i=ansStart;i<=ansEnd;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
