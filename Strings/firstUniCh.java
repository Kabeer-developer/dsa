import java.util.*;
public class firstUniCh {
    public static int printUni(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(map.get(ch)==1){
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "kabeer";
       System.out.println(printUni(s));
    }
}
