public class leaderArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
       
        for(int i=0;i<arr.length-1;i++){
            boolean isLeader = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                   isLeader=false;
                   break;
                }
            }
            if(isLeader){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[arr.length-1]);
    }
}
