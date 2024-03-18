// url : https://www.geeksforgeeks.org/problems/sum-of-array2326/1?page=1&difficulty=School&sortBy=difficulty

class Solution {
    int sum(int arr[], int n) {
        // code here
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum=totalsum+arr[i];
        }
        return totalsum;
    }
}

// Time complexity: O(n)
// Space complexity: O(1)