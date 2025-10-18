class Solution {
    public int maxProfit(int[] arr) {
        int buy = arr[0];
        int profit = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > buy){
                profit = Math.max(profit, arr[i]-buy);
            }
            buy = Math.min(buy , arr[i]);
        }
        return profit;
    }
}
