//Given two strings s and t, write a function to determine if t is an anagram of s.

//For example,
//s = "anagram", t = "nagaram", return true.
//s = "rat", t = "car", return false. 

public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();  
        char[] tArr = t.toCharArray();  
          
        Arrays.sort(sArr);  
        Arrays.sort(tArr); 
        //note: need to use String equals valueOf, == won't work.
        return String.valueOf(sArr).equals(String.valueOf(tArr)); 
    }
}
