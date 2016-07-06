// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0]. 

//no making copies, preferably O(1).
//The trick is to create two pointers i and j to trace along the way.

public class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        int temp;
        while(j<nums.length){
            if(nums[i]==0 && nums[j]!=0){
                //swap
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                
            }
            
            else if(nums[i]!=0){
                i++;
            }
            j++;
        }
    }
}
