import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "kabeer";
        String str2 = "abeerk";

        String[] newStr = str1.split("");
        Arrays.sort(newStr);

                String[] newStr2 = str2.split("");
                Arrays.sort(newStr2);

                if(Arrays.equals(newStr,newStr2)){
                    System.out.print("true");
                } else {
                    System.out.print("false");
                }

    }
}
