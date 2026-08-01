import java.util.HashSet;

public class ConsecutiveSequence {
    public static void main(String[] args) {

        int[] arr = { 7, 6, 3, 2, 1, 78, 5, 4, 43,0, 32 };
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for(int num : arr){
            set.add(num);
        }

        for(int num : arr){
            int count =0;
            if(!set.contains(num-1)){
                count++;

                while(set.contains(num+count)){
                count++;
            }
            }
            

            longest = Math.max(count, longest);
        }
        System.out.println(longest);
    }
}