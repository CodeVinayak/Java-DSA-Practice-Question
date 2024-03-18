// url https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&difficulty=Easy&sortBy=submissions

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int expected_sum=0;
        int actual_sum=0;
        int missing;
        for(int i=0;i<n-1;i++)
        {
            actual_sum=actual_sum+array[i];
        }
        expected_sum=(n*(n+1))/2;
        missing=expected_sum-actual_sum;
        return missing;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)