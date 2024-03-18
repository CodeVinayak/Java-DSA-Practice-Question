// url : https://www.geeksforgeeks.org/problems/find-index4752/1?page=1&difficulty=School&sortBy=submissions

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int arr[], int n, int key) 
    { 
        int leftIndex=-1;//Initalize leftIndex to -1
        int rightIndex=-1;//Initialize rightIndex to -1
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key){
                leftIndex=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==key){
                rightIndex=i;
                break;
            }
        }
        return new int[]{leftIndex,rightIndex};
    }
}

//Time complexity: O(n)
// Space complexity: O(1)