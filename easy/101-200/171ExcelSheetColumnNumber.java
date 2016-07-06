//Given a column title as appear in an Excel sheet, return its corresponding column number.
//C -> 3
//...
//Z -> 26
//AA ->27

public class Solution {
    public int titleToNumber(String s) {
        // create array 1-26, a-z
        int[] num=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};

        char[] dic=new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        //position of a character in dic array
        int position;
        //column digit
        int digit=0;
        //calculation result
        int result=0;
        //start from the last digit
        for(int i=s.length()-1;i>=0;i--){
            //the location of a character in array
            position = Arrays.binarySearch(dic, s.charAt(i));
            //Math.pow() returns double, so transfer to int.
            result= result+num[position]*(int)Math.pow(26,digit);
            digit++;
        }
        return result;
        
    }
}

//a better and faster way: since A-Z is calculatable within
public class Solution { 
    public int titleToNumber(String s) {
        int result = 0; 
        for (int i = 0; i < s.length(); i++) { 
            result = result * 26 + (s.charAt(i) - 'A' + 1); 
        } 
        return result; 
    }
}
