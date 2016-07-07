//Given two arrays, write a function to compute their intersection. 
//Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2]. 
//Each element in the result should appear as many times as it shows in both arrays.
//The result can be in any order.

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<Integer>();
        int m=0;
        int n=0;
        while(m<nums1.length && n<nums2.length){
            if(nums1[m]==nums2[n]){
                list.add(nums1[m]);
                m++;
                n++;
            }else if(nums1[m]>nums2[n]){
                n++;
            }else{
                m++;
            }
        }
        int[]res=new int[list.size()];  
        for(int i=0;i<res.length;i++){  
            res[i]=list.get(i);  
        }  
        return res;
    }
}