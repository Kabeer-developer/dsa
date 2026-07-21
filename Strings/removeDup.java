import java.util.HashSet;

public class removeDup {
    public static void main(String[] args) {
        String str = "banana";
        HashSet<Character> seen = new HashSet<>();
        StringBuilder ans = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
                ans.append(ch);
            }
        }
        System.out.println(ans);
    }
}
