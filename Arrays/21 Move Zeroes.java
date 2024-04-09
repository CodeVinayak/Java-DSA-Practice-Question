// url: https://leetcode.com/problems/move-zeroes/description/

class Solution {
    public void moveZeroes(int[] nums) 
    {
        int n=nums.length;
        int nonZeroIndex=0;
        // Move all non-zero elements to the front
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex]=nums[i];
                nonZeroIndex++;
            }
        }
        // Fill the remaining elements with 0
        while(nonZeroIndex<n)
        {
            nums[nonZeroIndex]=0;
            nonZeroIndex++;
        }
    }
}

// TimeComplexity=O(n)
// SPaceComplexity=O(1)