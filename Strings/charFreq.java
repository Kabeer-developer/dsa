import java.util.*;
public class charFreq {
    public static void main(String[] args) {
        String s = "kabeer";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            System.out.println(ch+":"+map.get(ch));
        }
    }
}
