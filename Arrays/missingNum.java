public class missingNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int currentSum =0;
        for(int i=0;i<arr.length;i++){
            currentSum+= arr[i];
        }
        int n = arr.length+1;
        int expectedSum = (n*(n+1))/2;
        int result = expectedSum-currentSum;
        System.out.print(result);
    }
}
