public class trapWater {
    public static int trapWater(int[] arr){
        int n = arr.length;
        int water=0;

        for(int i=0;i<n;i++){
            int leftMax =0;
            //find left tallest
            for(int j=0;j<=i;j++){
                leftMax = Math.max(leftMax,arr[j]);
            }
            int rightMax=0;
            for(int j=i;j<n;j++){
                rightMax = Math.max(rightMax,arr[j]);
            }
            water+=Math.min(leftMax,rightMax)-arr[i];
        }
        return water;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        System.out.println(trapWater(arr));
    }
}
