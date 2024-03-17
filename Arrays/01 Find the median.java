//url https://www.geeksforgeeks.org/problems/find-the-median0527/1?page=1&difficulty=School&sortBy=submissions

class Solution
{
    public int find_median(int[] v)
    {
        Arrays.sort(v);
        int num=v.length;
        int middleIndex=num/2;
        int median;
        if(num%2==0){
            //number is even then caluclate avergae of two number
            median=((v[middleIndex-1]+v[middleIndex])/2);
        }
        else{
            //number is odd the middle is avergae
            median=v[middleIndex];
        }
        return median;
    }
}

// Time Complexity:O(n log n)
// Sorting the array using Arrays.sort(v) has a time complexity of O(n log n), where n is the number of elements in the array.
// Finding the middle index and accessing elements of the array have constant time complexity O(1).
// Therefore, the overall time complexity of the method is dominated by the sorting operation, which is O(n log n).

// Space complexity: O(1)