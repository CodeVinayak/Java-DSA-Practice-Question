// url : https://www.geeksforgeeks.org/problems/count-of-smaller-elements5947/1?page=1&difficulty=School&sortBy=submissions

class Solution{
    public int countOfElements(int []arr,int n,int x)
    {
        int low=0;
        int high=n-1;
        int answer=0;
         // Perform binary search
        while(low<=high)
        {
        int mid=(low+high)/2;
            if (arr[mid]<=x)
            {
                answer=mid+1;
                low=mid+1;
            }
        else
            {
                high=mid-1;
            } 
        }
        return answer;
    }
}

// Example 1:
// Input:
// N = 6
// A[] = {1, 2, 4, 5, 8, 10}
// X = 9
// Output:
// 5

// Time complexity is O(log n) due to the binary search algorithm
// space complexity of the code is O(1)