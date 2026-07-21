class romanToInt{
    public static int value(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public static int romanToIntConvert(String str){
        int sum =0;
        for(int i=0;i<str.length();i++){
            int current = value(str.charAt(i));
            if(i<str.length()-1){
                int next = value(str.charAt(i+1));

                if(current<next){
                    sum-=current;
                } else {
                    sum+=current;
                }
            } else {
                sum+=current;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String roman = "IV";
        System.out.println(romanToIntConvert(roman));
        String roman2 = "VI";
        System.out.println(romanToIntConvert(roman2));
        String roman3 = "XXX";
        System.out.println(romanToIntConvert(roman3));
    }
}