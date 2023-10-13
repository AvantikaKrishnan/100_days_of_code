import java.util.*;

public class BinaryTreeYt {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            this.data = d;
            this.left = null;
            this.right = null;
        }

        static class BinaryTree{
            public static int idx = -1;
            public static Node buildTree(int nodes[])
            {
                idx++;
                if(nodes[idx] == -1)
                    return null;

                Node newnode = new Node(nodes[idx]);
                newnode.left = buildTree(nodes);
                newnode.right = buildTree(nodes);

                return newnode;

            }
        }

        public static void main(String[] args) {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println(root.data);
            System.out.println("Preorder");
            preorder(root);
            System.out.println();
            System.out.println("Inorder");
            inorder(root);
            System.out.println();
            System.out.println("Postorder");
            postorder(root);
            System.out.println();
            System.out.println("Level order");
            levelorder(root);
            System.out.println();
            System.out.println("Count");
            System.out.println(count(root));
            System.out.println();
            System.out.println("sum of nodes");
            System.out.println(sum(root));
            System.out.println("Diameter of tree (Approach 1) ");
            System.out.println(diameter_Approach1(root));
            System.out.println("Diameter of tree (Approach 2) ");
            System.out.println(diameter_Approach2(root).diam);

        }
        public static void preorder(Node root)
        {
            if(root == null)
                return;

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root)
        {
            if(root == null)
                return;


            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root)
        {
            if(root == null)
                return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelorder(Node root)
        {
            if(root == null)
                return;

             Queue<Node> q = new LinkedList<>();
             q.add(root);
             q.add(null);
             while(!q.isEmpty())
             {
                 Node currNode = q.remove();
                 if(currNode== null)
                 {
                     System.out.println();
                     if(q.isEmpty())
                         break;
                     else
                         q.add(null);

                 }
                 else {
                     System.out.print(currNode.data);
                     if(currNode.left != null)
                         q.add(currNode.left);
                     if(currNode.right != null)
                         q.add(currNode.right);

                 }
             }
        }
        public static int count(Node root)
        {
            if(root == null)
                return 0;

            int left = count(root.left);
            int right = count(root.right);

            return left+right+1;
        }
        public static int sum(Node root)
        {
            if(root == null)
            {
                return 0;
            }

            int left = sum(root.left);
            int right = sum(root.right);


            return left+right+root.data;
        }
        public static int maxheight(Node root)
        {
            if(root == null)
                return 0;

            int left = maxheight(root.left);
            int right = maxheight(root.right);

            int myheight = Math.max(left,right)+1;

            return myheight;
        }
        public static int diameter_Approach1(Node root)
        {
            if(root == null)
                return 0;

            int diam1 = diameter_Approach1(root.left);
            int diam2 = diameter_Approach1(root.right);
            int diam3 = maxheight(root.left) + maxheight(root.right)+1 ;
           // System.out.println(diam3);


            return Math.max(diam3, Math.max(diam1,diam2));


        }

        ///// diameter approach 2 we create a structure so that we can return the height and diameter together

        static class TreeInfo {
            int ht;
            int diam;

            TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;

            }
        }
        public static TreeInfo diameter_Approach2(Node root)
        {

            if(root == null)
            {
                return new TreeInfo(0,0);
            }
            TreeInfo left = diameter_Approach2(root.left);
            TreeInfo right = diameter_Approach2(root.right);

            int myheight = Math.max(left.ht,right.ht)+1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht +1;

            int mydiam = Math.max(diam3, Math.max(diam1,diam2));

            TreeInfo myInfo = new TreeInfo(myheight,mydiam);
            return myInfo;

        }


    }

}
