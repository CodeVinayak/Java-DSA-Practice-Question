// url: https://www.geeksforgeeks.org/problems/common-elements1132/1?page=1&difficulty=Easy&sortBy=submissions

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> result=new ArrayList<>();
        int x=0;
        int y=0;
        int z=0;
        while(x<n1 && y<n2 && z<n3)
        {
            if(A[x]==B[y] && B[y]==C[z])
            {
                if(result.isEmpty() || result.get(result.size()-1)!=A[x])
                {
                    result.add(A[x]);
                }
                x++;
                y++;
                z++;
            }
            else if(A[x]<B[y]){
                x++; // Move to the next element in A
            }
            else if(B[y]<C[z])
            {
                y++; // Move to the next element in B
            }
            else{
                z++; // Move to the next element in C
            }
        }
        return result;
    }
}
//Time complexity: O(n1+n2+n3) i.e O(n)
// Space complexity: O(1)