public class containerWater {
    public static int containerWithMostWater(int[] arr){
        int max =0;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int width = j-i;
                int height = Math.min(arr[i],arr[j]);
                int area = width*height;
                if(area>max){
                    max = area;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(arr));
    }
}
