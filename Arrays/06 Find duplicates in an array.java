// url https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&difficulty=Easy&sortBy=submissions

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) 
    {
        // code here
        Arrays.sort(arr);
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> duplicates=new HashSet<>();
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                duplicates.add(arr[i]);
            }
        }
        if (duplicates.isEmpty())
        {
            duplicates.add(-1);
        }
        ArrayList<Integer> result = new ArrayList<>(duplicates);
        result.sort(null); // Sort the duplicates in ascending order
        return result;
    }
}

//Time complexity: O(nlogn)
// Space complexity: O(n)