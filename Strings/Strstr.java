public class Strstr {
    
    public static int strStr(String str1, String str2) {
       int n = str1.length();
       int m = str2.length();
        if(m==0) return 0;
       for(int i=0;i<=n-m;i++){
        int j=0;
        while(j<m && str1.charAt(i+j)==str2.charAt(j)){
            j++;
        }
        if(j==m){
            return i;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ll";
        System.out.println(strStr(s1,s2));
    }
}
