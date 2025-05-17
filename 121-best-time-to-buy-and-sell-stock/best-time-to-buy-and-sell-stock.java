class Solution {
    public int maxProfit(int[] arr) {
        int minBuy = arr[0];
        int profit =0; 
        int maxProfit = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            profit = arr[i] - minBuy;

            if(profit> maxProfit){
                maxProfit = profit;
            }
            minBuy = Math.min(minBuy, arr[i]);
        }

        if(maxProfit< 0){
            return 0;
        }
        return maxProfit;
    }
}