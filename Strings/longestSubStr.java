import java.util.HashMap;

public class longestSubStr {
    public static void main(String[] args) {
        int count =0;
        int max =0;
        
        String str = "dvdf";
        for(int j=0;j<1;j++){
        HashMap<Character,Integer> map = new HashMap<>();         
        for(int i=0;i<str.length();i++){
            int start =0;
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),i);
                count++;
            } else {
                start = map.get(str.charAt(i));
                count =0;
                map.clear();
                i=start;
                
            }

            max = Math.max(count,max);
    
        }
        System.out.println(max);
    }
    
    }
}
