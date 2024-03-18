// url = https://www.geeksforgeeks.org/problems/level-order-traversal/0
/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null)
        return result;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                Node currentNode=queue.poll();
                result.add(currentNode.data);
                if(currentNode.left!=null)
                {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;
    }
}

// Time complexity = O(n)
// Space complexity = O(n)