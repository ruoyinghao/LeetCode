//Given a non-negative number represented as an array of digits, plus one to the number.
//The digits are stored such that the most significant digit is at the head of the list.

public class Solution {
    public int[] plusOne(int[] digits) 
{
    boolean carry = true;
    for (int i=digits.length-1; i>=0; i--) {
        if (carry == true) {
            if (digits[i] == 9) {
                digits[i] = 0;
                carry = true;
            } else {
                digits[i] += 1;
                carry = false;
            }
        } 
    }
    if (carry == false) {
        return digits;
    } else {
        int[] res = new int[digits.length+1];
        res[0] = 1;
        for (int i=0; i<digits.length; i++) {
            res[i+1] = digits[i];
        }
        return res;
    }
}
}
