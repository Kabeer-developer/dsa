public class remOuterParan {
    public static void main(String[] args) {
        String paranthesis = "(()())(())";

        int count =0;
        int closeParan = 0;
        for(int i=0;i<paranthesis.length();i++){
            if(paranthesis.charAt(i) == '('){
                count++;
            } else {
                count--;
            }
            if(count==0){
                closeParan+=2;
            }
        }
        int total = (paranthesis.length()-closeParan)/2;
        for(int i=0;i<total;i++){
            System.out.print("()");
        }
    }
}

