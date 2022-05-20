class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minl = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < minl) minl = prices[i];
            int p = prices[i] - minl;
            if(p > profit) profit = p;
        }
        return profit;
    }
}