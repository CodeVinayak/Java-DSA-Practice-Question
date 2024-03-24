// url: https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?page=1&difficulty=Basic&sortBy=submissions

class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        Arrays.sort(a);
        long minimum=a[0];
        long maximum=a[(int)(n-1)];
        return new Pair(minimum,maximum);
    }
}
// Arrays.sort) is O(n log n)
//Time complexity: O(nlogn)
// Space complexity: O(n)

class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        long minimum=a[0];
        long maximum=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<minimum)
            {
                minimum=a[i];
            }
            if(a[i]>maximum){
                maximum=a[i];
            }
        }
        return new Pair (minimum,maximum);
    }
}
//Time complexity: O(n)
// Space complexity: O(1)