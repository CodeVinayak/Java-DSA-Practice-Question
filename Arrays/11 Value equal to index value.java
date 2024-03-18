// url: https://www.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&difficulty=School&sortBy=submissions

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
    ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if (arr[i]==i+1){
                result.add(arr[i]);
            }
        }
        return result;
    }
}

//Time complexity: O(n)
// Space complexity: O(n)