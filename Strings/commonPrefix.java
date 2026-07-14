public class commonPrefix {
    public static void main(String[] args) {
        String s1 = "flower";
        String s2 = "flask";
       
String res = "";
        int min = Math.min(s1.length(),s2.length());
        for(int i=0;i<min;i++){
            if(s1.charAt(i) == s2.charAt(i)){
                res+= s1.charAt(i);
            }
        }
        System.out.print(res);
    }   
}
