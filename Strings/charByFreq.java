import java.util.HashMap;

public class charByFreq {
    public static void main(String[] args) {
       String str = "kabeer";
       HashMap<Character,Integer> map = new HashMap<>();
       
       for(int i=0;i<str.length();i++){
          char ch = str.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)+1);
       }
       
       for(int freq=1;freq<=str.length();freq++){
           for(int i=0;i<str.length();i++){
               char ch = str.charAt(i);
               if(map.get(ch)==freq){
                   System.out.print(ch+":"+map.get(ch)+" ");
               }
           }
       }
    }
}
