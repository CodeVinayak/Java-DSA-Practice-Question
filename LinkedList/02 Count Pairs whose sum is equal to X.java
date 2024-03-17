// URL https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/0

/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        Set<Integer> seen=new HashSet<>();
        int count=0;
        
        //Traverse first linkedlist and store value in that set
        for(Integer value:head1)
        {
            seen.add(value);
        }
        //Traverse linkedlist and check if x - current value exit in the second linked list
        for(Integer value:head2)
        {
            int complement=x-value;
            if(seen.contains(complement)){
                count++;
                seen.remove(complement);//remove complement to avoid counting same pairs ahain
            }
        }
        return count;
    }
}

// Time Complexity: O(N+M)
// Space Complexity: O(N)