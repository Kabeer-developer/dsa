import java.util.HashSet;

public class HappyNum {
    public static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();

        while(!set.contains(n)){
            set.add(n);
            int sum =0;
        while (n>0){
            int lastDigit = n%10;
            n = n/10;
            sum += lastDigit*lastDigit;
            
        }
        if(sum ==1) return true;
        n = sum;
        
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 19;
        int n1 = 3;
        System.out.println(isHappy(n));
        System.out.println(isHappy(n1));
        
    }
}
