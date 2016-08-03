//Say you have an array for which the ith element is the price of a given stock on day i.
//If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
//design an algorithm to find the maximum profit.


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
