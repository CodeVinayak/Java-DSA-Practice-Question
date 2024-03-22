// url: https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=1&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions

class Solution{
    static int search(int arr[], int N, int X)
    {
        for(int i=0;i<N;i++){
            if(arr[i]==X)
            {
                return i; // Return the index of X if found
            }
        }
        return -1;
    }
}

//Time complexity: O(n)
// Space complexity: O(1)