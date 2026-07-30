public class MinWinSubstr {
    public static String minWinString(String s ,String t){
        if(s==null || t==null || s.length()<t.length()){
            return "";
        }
        int[] freq = new int[128];
        for(char c : t.toCharArray()){
            freq[c]++;
        }

        int left=0;
        int right=0;
        int count=t.length();
        int start =0;
        int minLength = Integer.MAX_VALUE;

        while(right<s.length()){
            char ch = s.charAt(right);
            if(freq[ch]>0){
                count--;
            }
            freq[ch]--;
            right++;

            while(count==0){
                if(right-left < minLength){
                    minLength = right-left;
                    start = left;
                }

                char leftChar = s.charAt(left);
                freq[leftChar]++;
                if(freq[leftChar]>0){
                    count++;
                }
                
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start,start+minLength);

    }
    public static void main(String[] args) {
        String s1 = "aarybaya";
        String s2 = "aab";
        String s3 = "abetdcabc";
        String s4 = "abc";

        System.out.println(minWinString(s1,s2));
        System.out.println(minWinString(s3, s4));
    }
}
