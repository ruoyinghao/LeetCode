public class Solution {  
    public int maxProfit(int[] prices) {  
        if (prices.length ==0 ) return 0;  
        int minPrice = prices[0];  
        int maxGap = 0;  
        for (int i = 1; i < prices.length; i++) {  
            if(prices[i] - minPrice > maxGap) {  
                maxGap = prices[i] - minPrice;  
            }  
            if (prices[i] < minPrice) {  
                minPrice = prices[i];  
            }  
        }  
        return maxGap;  
    }  
}
