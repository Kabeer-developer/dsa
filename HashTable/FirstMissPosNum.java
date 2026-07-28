import java.util.HashSet;

public class FirstMissPosNum {
    public static void main(String[] args) {
        int[] arr = {1,-1,4,3,2,5,8,7};
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        int missing = 1;

        while(set.contains(missing)){
            missing++;
        }
        System.out.println(missing);
    }
}
