import java.util.HashSet;

public class ContainsDup {
    public static void main(String[] args) {
        String str = "abscg";
        HashSet<Character> set = new HashSet<>();
        boolean containsDuplicate = false;
        for(int i=0;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
            } else {
                containsDuplicate = true;
                System.out.println(containsDuplicate);
                return;
            }
        }
        System.out.println(containsDuplicate);
    }
}
