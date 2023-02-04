// Java program to delete element
// in binary tree

import java.util.LinkedList;
import java.util.Queue;
 
class Left{
     
// A binary tree node has data, pointer to
// left child and a pointer to right child

static class Node
{
    int data;
    Node left, right;
     
    // Constructor
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
 
static Node root;
static Node node = root;
 
// Inorder traversal of a binary tree
	static void inorderTraversal(Node node)
	{
		if (node != null)
		{
			inorderTraversal(node.left);
			System.out.print(node.data + " ");
			inorderTraversal(node.right);
		}
		
	}
    
    
static boolean isBST(Node root) {
    if (root == null) {
        return true;
    }
    if (root.left != null && root.left.data > root.data) {
        return false;
    }
    if (root.right != null && root.right.data < root.data) {
        return false;
    }
    if (!isBST(root.left) || !isBST(root.right)) {
        return false;
    }
    return true;
}
static int max_level = 0;

static void rightSide(Node node, int level)
    {
        // Base Case
        if (node == null)
            return;
 
        // If this is the first node of its level
        if (max_level < level) {
            System.out.print(node.data + " ");
            max_level = level;
        }
 
        // Recur for left and right subtrees
        rightSide(node.right, level + 1 );
        rightSide(node.left, level + 1);
    }

    static void rightView()
    {
        max_level = 0;
        rightSide(root, 1);
    }


static void leftSide(Node node, int level)
{
    // Base Case
    if (node == null)
        return;

    // If this is the first node of its level
    if (max_level < level) {
        System.out.print(node.data + " ");
        max_level = level;
    }

    // Recur for left and right subtrees
    leftSide(node.left, level + 1); 
    leftSide(node.right, level + 1);
    
}

// A wrapper over leftViewUtil()
static void leftView()
{
    max_level = 0;
    leftSide(root, 1);
}
   
 
// Driver code
public static void main(String args[])
{
    root = new Node(100);
    root.left = new Node(50);
    root.left.left = new Node(30);
    root.left.right = new Node(70);
    root.right = new Node(150);
    root.right.left = new Node(140);
    root.right.right = new Node(180);
    root.right.right.left = new Node(160);
    root.left.left.left = new Node(20);
    root.left.left.right = new Node(40);
    root.right.right.left.right = new Node(170);
    root.right.right.left.left = new Node(155);
    root.right.right.right = new Node(200);
    root.right.right.left.right.left = new Node(165);
    root.right.right.left.right.right = new Node(175);
    root.left.left.right.left = new Node(35);
    root.left.left.right.right = new Node(45);
    root.left.left.right.left.right = new Node(37);
    root.left.left.right.left.left = new Node(33);
    
 
    // System.out.print("Inorder traversal " 
    //                );
    // inorderTraversal(root);
    // System.out.println();
    System.out.println("Is the tree a BST? " + isBST(root));
    System.out.println("Left subtree");
    leftView();
    System.out.println();
    System.out.println("Right subtree");
    rightView();
 
}
}



	



