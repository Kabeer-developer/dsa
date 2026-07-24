import java.util.HashSet;

public class consecutiveSequence {
    public static void main(String[] args) {

       int[] arr = {7,6,3,2,1,78,5,4,43,32};
       HashSet<Integer> set = new HashSet<>();
        int longest =0;
       for(int num : arr){
        set.add(num);
       }

       for(int num : arr){
        if(!set.contains(num-1)){
            int count =1;

            while(set.contains(num+count)){
                count++;
            }

            longest = Math.max(longest,count);
        }
       }
       System.out.println(longest);
    }
}