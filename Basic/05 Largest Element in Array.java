// url: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1?page=1&difficulty=Basic&sortBy=submissions

class Compute 
{
    public int largest(int arr[], int n)
    {
        Arrays.sort(arr);
        int a=arr[n-1];
        return a;
    }
}

// Time complexity: O(n log n)
// Space complexity: O(1)