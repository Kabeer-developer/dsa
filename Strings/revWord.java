public class revWord {
    public static void main(String[] args) {
        String str="Hello Kabeer";
        String[] words = str.split(" ");

        for(String w : words){
            for(int i=w.length()-1;i>=0;i--){
                System.out.print(w.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
