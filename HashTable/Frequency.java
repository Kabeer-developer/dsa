import java.util.HashMap;

class Frequency{
    public static void main(String[] args){
        String str = "kabeerbosss";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        int max = 0;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(map.get(ch)<min){
            min = map.get(ch);
           }
           if(map.get(ch)>max){
            max = map.get(ch);
           }
        }
        System.out.println(min+" "+max);

    }
}