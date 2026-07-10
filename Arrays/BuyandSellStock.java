public class BuyandSellStock{
    public static void main(String[] args) {
        int result=0;
        int[] arr = {7,1,3,4,6,9};

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
               int currentBuy = arr[i];
                int currentSell = arr[j];
              int  profit = currentSell-currentBuy;
                if(profit>result){
                    result=profit;
                }
            }
        }
        System.out.println(result);
    }
}