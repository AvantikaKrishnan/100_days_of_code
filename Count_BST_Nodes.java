import java.util.*;
class Solution
{
     public static class TreeNode
    {
        int data;
        TreeNode right;
        TreeNode left;
        TreeNode(int n)
        {
            data = n;
            right = null;
            left =null;
        }
    }
    public static TreeNode root;
    public static TreeNode createBST(TreeNode root , int n)
    {
        if(root == null)
        root= new TreeNode(n);
        else
        {
            if(root.data>n)
            {
                root.left = createBST(root.left,n);
            }
            else
            root.right = createBST(root.right, n);
        }
        return root;
    }
    public static int count(TreeNode root)
    {
        if(root == null)
        return 0;
        
         return count(root.right)+count(root.left)+1;
         
        
        
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            root = createBST(root,n);
        }
        
        int r = count(root);
        System.out.println(r);
        
    }
}
