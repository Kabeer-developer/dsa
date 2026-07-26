class MaxProductSubArr{
    public static void main(String[] args){
        int[] arr = {1,4,7,0,2,-7,7,4};
        int max = arr[0];
    int min = arr[0];
    int ans = arr[0];

    for(int i=1;i<arr.length;i++){
        if(arr[i]<0){
            int temp = max;
            max = min;
            min = temp;
        }

        max = Math.max(arr[i],max*arr[i]);
        min = Math.min(arr[i],min*arr[i]);
        ans = Math.max(ans,max);
    }
    System.out.println(ans);
    }
}