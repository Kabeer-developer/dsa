public class ContainerWater {
    public static int containerWithMostWater(int[] arr){
       int max =0;
       int left =0;
       int right = arr.length-1;

       while(left<right){
        int width = right-left;
        int height = Math.min(arr[left], arr[right]);
        int area = width*height;

        max = Math.max(max,area);

        if(arr[left]<arr[right]){
            left++;
        } else {
            right--;
        }
       }
       return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(arr));
    }
}
