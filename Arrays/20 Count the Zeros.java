// url https://www.geeksforgeeks.org/problems/count-the-zeros2550/1?page=6&difficulty=Easy&sortBy=submissions

class Solution {
    int countZeroes(int[] arr, int n) {
        int count=0;
        for(int i=0;i<n;i++){
            if (arr[i]==0){
                count++;
            }
        }
        return count;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)