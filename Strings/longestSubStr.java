import java.util.HashMap;

public class longestSubStr {
    public static void main(String[] args) {
        int count =0;
        int max =0;
        int indStart =0;
        int startIndex = 0;
        int endIndex = 0;
        String str = "dvdf";
        for(int j=0;j<1;j++){
        HashMap<Character,Integer> map = new HashMap<>();         
        for(int i=0;i<str.length();i++){
            int start =0;
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),i);
                count++;
                startIndex = indStart;
                endIndex = i;
            } else {
                start = map.get(str.charAt(i));
                count =0;
                map.clear();
                i=start;
                indStart = i+1;
                
            }

            max = Math.max(count,max);
    
        }
        System.out.println(max);
         for(int i=indStart;i<=endIndex;i++){
                System.out.println(str.charAt(i));
            }
    }
    
    }
}
