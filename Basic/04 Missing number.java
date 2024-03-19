// url https://www.geeksforgeeks.org/problems/missing-number4257/1?page=3&difficulty=Basic&sortBy=submissions

class Solution {
    public static int missingNumber(int n, int[] arr) {
        int expected_sum=0;
        int actual_sum=0;
        int missing;
        for(int i=0;i<n-1;i++)
        {
            actual_sum=actual_sum+arr[i];
        }
        expected_sum=(n*(n+1)/2);
        missing=expected_sum-actual_sum;
        return missing;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)