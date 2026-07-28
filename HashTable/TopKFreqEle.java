
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;


public class TopKFreqEle {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,5,5};
        int k =2;
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int num : arr){
        map.put(num,map.getOrDefault(num,0 )+1);
       }
       List<Integer>[] bucket = new List[arr.length+1];
       for(int key : map.keySet()){
        int freq = map.get(key);

        if(bucket[freq]==null){
            bucket[freq] = new ArrayList<>();
        }
        bucket[freq].add(key);
       }

       int[] result = new int[k];
       int index =0;

       for(int i=bucket.length-1;i>=0 && index<k;i--){
        if(bucket[i] != null){
            for(int num : bucket[i]){
                result[index++] = num;
                if(index==k) break;
            }
        }
       }
       System.out.println(Arrays.toString(result));
    }
}
