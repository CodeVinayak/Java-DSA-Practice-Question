// URL: https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?page=1&difficulty=School&sortBy=submissions

class Solution
{
  public void printNos(int N)
    {
        if(N!=0){
            printNos(N-1);
            System.out.print(N+ " ");
        }
        
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)

/*For Input: 
10
Your Output: 
1 2 3 4 5 6 7 8 9 10
Expected Output: 
1 2 3 4 5 6 7 8 9 10
*/