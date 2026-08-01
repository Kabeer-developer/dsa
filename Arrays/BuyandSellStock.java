public class BuyandSellStock{
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,8,5,3};
        int minPrice = arr[0];
        int maxProfit =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minPrice){
                minPrice = arr[i];
            }

            int profit = arr[i]-minPrice;
            maxProfit = Math.max(profit,maxProfit);
        }
        System.out.println(maxProfit);
    }
}