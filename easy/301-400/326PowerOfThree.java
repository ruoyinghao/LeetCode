//test if an integer n is the power of 3
public class Solution {
    public boolean isPowerOfThree(int n) {
        //max 3^n is 3^19=1162261467
        return (n > 0 && 1162261467 % n == 0);
    }
}
