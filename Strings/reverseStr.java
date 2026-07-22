public class reverseStr{
    public static void main(String args[]){
        String str = "Hello Kabeer";

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}