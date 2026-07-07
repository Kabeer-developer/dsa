public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,6,6,7,8};

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
