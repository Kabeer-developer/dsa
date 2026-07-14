public class Palindrome {
    public static boolean checkPalindrome(String str){
        boolean isPalindrome = true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                isPalindrome=false;
                return isPalindrome;
            }
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        String str = "helle";
        String str2 = "madam";
        System.out.println(checkPalindrome(str));
        System.out.println(checkPalindrome(str2));

    }
}
