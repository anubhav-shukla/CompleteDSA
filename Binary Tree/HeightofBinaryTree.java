package DSA;

public class HeightofBinaryTree {

	// Java program to find height of tree
	 
	// A binary tree node
  static	class Node 
	{
	    int data;
	    Node left, right;
	 
	    Node(int item) 
	    {
	        data = item;
	        left = right = null;
	    }
	}
	 
	     Node root;
	 
	    /* Compute the "maxDepth" of a tree -- the number of 
	       nodes along the longest path from the root node 
	       down to the farthest leaf node.*/
	    int maxDepth(Node node) 
	    {
	        if (node == null)
	            return -1;
	        else 
	        {
	            /* compute the depth of each subtree */
	            int lDepth = maxDepth(node.left);
	            int rDepth = maxDepth(node.right);
	 
	            /* use the larger one */
	            if (lDepth > rDepth)
	                return (lDepth + 1);
	             else 
	                return (rDepth + 1);
	        }
	    }
	     
	    /* Driver program to test above functions */
	    public static void main(String[] args) 
	    {
	    	HeightofBinaryTree tree = new HeightofBinaryTree();
	 
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	 
	        System.out.println("Height of tree is : " + 
	                                      tree.maxDepth(tree.root));
	    }
	}

