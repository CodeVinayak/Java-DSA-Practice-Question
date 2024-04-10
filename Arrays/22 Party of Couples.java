// url: https://www.geeksforgeeks.org/problems/alone-in-couple5507/1

class Solution{
    static int findSingle(int n, int arr[]){
        // code here
        Arrays.sort(arr);
        for(int i=0;i<n-1;i=i+2){
           if(arr[i]!=arr[i+1]){
               return arr[i];
           }
        }
        return arr[n-1];
    }
}
// Time Complexity: O(n log n)
// Space Complexity: O(1)