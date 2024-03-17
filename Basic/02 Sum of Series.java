// url https://www.geeksforgeeks.org/problems/sum-of-series2811/1?page=1&difficulty=School&sortBy=submissions

class Solution {
    public static long seriesSum(long n) {
        if (n==1)
        return n;
        else{
            n=n*(n+1)/2;
        }
        return n;
    }
}

// Time Complexity: O(1)
// Auxiliary Space: O(1)