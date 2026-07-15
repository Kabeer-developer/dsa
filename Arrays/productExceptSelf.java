public class productExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int product =1;

        for(int i=0;i<arr.length;i++){
            product*=arr[i];
        }
        System.out.println(product);

        //Except self

        for(int i=0;i<arr.length;i++){
            int result=0;
             result = product/arr[i];
            System.out.println(result);
        }
    }
}
