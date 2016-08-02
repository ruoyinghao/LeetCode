//You are climbing a stair case. It takes n steps to reach to the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 

public class Solution {
      public int climbStairs(int n) {  
          int n1 = 0, n2 = 1, sum = 0;  
          for (int i = 0; i < n; i++) {  
              sum = n1 + n2;  
              n1 = n2;  
              n2 = sum;  
              
          }  
          return sum;  
      }
}
