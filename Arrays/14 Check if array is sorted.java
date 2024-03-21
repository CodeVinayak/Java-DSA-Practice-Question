// url https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        int bigvalue=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=bigvalue)
            {
                bigvalue=arr[i];
            }else{
                return false;
            }
        }
        return true;
    }
}

//Time complexity: O(n)
// Space complexity: O(1)