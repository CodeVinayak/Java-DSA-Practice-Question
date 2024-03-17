// URL https://www.geeksforgeeks.org/problems/delete-without-head-pointer/0

class Solution
{
    void deleteNode(Node del_node)
    {
        if(del_node==null || del_node.next==null)
        {
            return; 
        }
        else{
            //copy value of next node to current node
            del_node.data=del_node.next.data;
            //update next pointer to current node
            del_node.next=del_node.next.next;
        }
    }
}

// Time Complexity: O(1) (Constant time)
//this algorithm only involves updating the data and pointers of the nodes directly involved in the deletion operation.
// Space Complexity: O(1) (Constant space)