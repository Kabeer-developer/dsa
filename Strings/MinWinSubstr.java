public class MinWinSubstr {
    public static void main(String[] args) {
        String str = "aab";
        String target = "aab";
        int size =target.length();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=str.length()-size;j++){
                String temp = "";
                for(int k=j;k<j+size;k++){
                    temp+= str.charAt(k);
                }
                int count =0;
                for(int k=0;k<target.length();k++){
                    
                    for(int l=0;l<temp.length();l++){
                        if(target.charAt(k) == temp.charAt(l)){
                            count++;
                        }
                    }
                    if(count == target.length()){
                        System.out.println(temp);
                        return;
                    }
                }
                
            }
            if(size==str.length())return;
            size++;
        }
    }
}
