//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit. 
//Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it. 

//The trick is to find the relations between outputs:
//0 1 2 3 4 5 6 7 8 9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 ....
//0 1 2 3 4 5 6 7 8 9  1  2  3  4  5  6  7  8  9  1  2  3  4  5  6  7  8 ....
//be careful that all numbers divisible by 9 (except 9 itself) results in 9.


public class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        else if (num%9==0){
            return 9;
        }
        else{
            return (num-9)%9;
        }
        
        
    }
}
