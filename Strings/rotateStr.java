public class rotateStr {
    public static void main(String[] args) {
        String str = "kabeer";

        String res ="";
        int k = 2;
        for(int i=0;i<str.length();i++){
            res+= str.charAt((i+k)%str.length());
        }
        System.out.print(res);
    }
}
