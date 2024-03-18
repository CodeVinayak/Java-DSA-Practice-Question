// url: https://www.geeksforgeeks.org/problems/reversal-algorithm5340/1?page=2&difficulty=Basic&sortBy=submissions

class Solution {
    void reverse(int arr[],int start,int end)
    {
        while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
    }
    void leftRotate(int[] arr, int n, int d) {
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
}
//Time complexity: O(n)
// Space complexity: O(n)