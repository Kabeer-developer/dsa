public class BuyandSell2{
    public static void main(String[] args) {
        int result=0;
        int[] arr = {7,1,3,4,6,9};

        for(int i=0;i<arr.length-1;i++){
               int currentBuy = arr[i];
                int currentSell = arr[i+1];
              int  profit = currentSell-currentBuy;
                if(profit>0){
                    result+=profit;
                }
            
        }
        System.out.println(result);
    }
}