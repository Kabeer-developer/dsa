import java.util.ArrayList;

public class zerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,0,4,0};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                list.add(arr[i]);
            }
        }
         for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
}
