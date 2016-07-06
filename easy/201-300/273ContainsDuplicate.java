//Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct. 
//USE HASH TABLE
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0 || nums.length==1) return false;
        HashSet set = new HashSet();
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])) return true;
        }
        return false;
        
    }
}