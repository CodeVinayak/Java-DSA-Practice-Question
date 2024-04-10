// url: https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&category=Arrays&difficulty=Medium&sortBy=submissions

class Solution{
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    
    long maxSubarraySum(int arr[], int n){
   long currentSum=arr[0];
   long maxSum=arr[0];
    
    if(n==0){
    return -1;
    }
    
    for(int i=1;i<n;i++){
        currentSum=Math.max(arr[i],currentSum+arr[i]);
        maxSum=Math.max(maxSum,currentSum);
        
        if(arr[i]>maxSum)
        return -1;
    }
    return maxSum;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1) 