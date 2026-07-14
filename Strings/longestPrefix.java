public class longestPrefix {
    public static void main(String[] args) {
        String s1 = "kabmeer";
        String s2 = "kazleer";
        int min = Math.min(s1.length(),s2.length());
        int start=0;
        int ansStart=0;
        int ansEnd =0;
        int count=0;
        int max=0;
        for(int i=0;i<min;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                count++;
                if(count>max){
                ansStart=start;
                ansEnd=i;
                max =count;
                }
            } else {
                start=i+1;
                count=0;
            }
        }
        System.out.println(max);
        for(int i=ansStart;i<=ansEnd;i++){
            System.out.println(s1.charAt(i));
        }
    }
}
