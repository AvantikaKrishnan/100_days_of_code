import java.util.*;
class sol
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
            left = null;
        }
    }
     public static TreeNode root;
    
    // public static TreeNode createBST(TreeNode root, int n)
    // {
        
    //     if(root == null)
    //     {
    //     root = new TreeNode(n);
    //     }
    //     else
    //     {
    //         if(root.data > n )
    //         {
    //         root.left = createBST(root.left, n);
    //         }
    //         else
    //         root.right = createBST(root.right, n);
    //     }
    //     return root;
    // }
    
    public static void LevelOrder()
    {
       Stack<TreeNode> s1 = new Stack<>();
       Stack<TreeNode> s2 = new Stack<>();
       
       s1.push(root);
       while(!s1.empty() || !s2.empty())
       {
           while(!s1.empty())
           {
           TreeNode temp = s1.peek();
           s1.pop();
           System.out.print(temp.data +" ");
          
           if(temp.right != null)
           s2.push(temp.right);
           if(temp.left != null)
           s2.push(temp.left);
       }
       while(!s2.empty())
       {
           TreeNode temp = s2.peek();
           s2.pop();
           System.out.print(temp.data +" ");
           
           if(temp.left != null)
           s1.push(temp.left);
           if(temp.right != null)
           s1.push(temp.right);
       }
    }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = 7;
        int arr[] = new int[N];
        
           root = new TreeNode(sc.nextInt());
           root.left = new TreeNode(sc.nextInt());
           root.right = new TreeNode(sc.nextInt());
           root.left.left = new TreeNode(sc.nextInt());
           root.left.right = new TreeNode(sc.nextInt());
           root.right.left = new TreeNode(sc.nextInt());
           root.right.right  = new TreeNode(sc.nextInt());
           
        
        
        LevelOrder();
    
    }
}
