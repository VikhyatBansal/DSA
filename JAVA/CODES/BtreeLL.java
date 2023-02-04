// Java program to delete element
// in binary tree

import java.util.LinkedList;
import java.util.Queue;
 
class BTreeLL{
     
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

	static void preorderTraversal (Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preorderTraversal(node.left);
			preorderTraversal(node.right);
		}
	}
    
	void postorderTraversal (Node node) {
		if(node != null){
			postorderTraversal(node.left);
			postorderTraversal(node.right);
			System.out.print(node.data+" ");

		}

	}
	
// Algorithm:

// Starting at the root, find the deepest and rightmost node in the binary tree and the node which we want to delete. 
// Replace the deepest rightmost node’s data with the node to be deleted. 
// Then delete the deepest rightmost node.

static void deleteDeepest(Node root,
                          Node delNode)
{
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
     
    Node node = null;
     
    // Do level order traversal until last node
    while (!q.isEmpty())
    {
        node = q.peek();
        q.remove();
         
        if (node == delNode)
        {
            node = null;
            return;
             
        }
        if (node.right!=null)
        {
            if (node.right == delNode)
            {
                node.right = null;
                return;
        }
        else
            q.add(node.right);
    }
 
    if (node.left != null)
    {
        if (node.left == delNode)
        {
            node.left = null;
            return;
        }
        else
            q.add(node.left);
    }
}
}
 
// Function to delete given element
// in binary tree
static void delete(Node root, int data)
{
    if (root == null)
        return;
         
    if (root.left == null &&
       root.right == null)
    {
        if (root.data == data)
        {
              root=null;
              return;
        }
        else
            return;
    }
     
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    Node node = null, dataNode = null;
     
    // Do level order traversal until
    // we find data and last node.
    while (!q.isEmpty())
    {
        node = q.peek();
        q.remove();
         
        if (node.data == data)
            dataNode = node;
 
        if (node.left != null)
            q.add(node.left);
 
        if (node.right != null)
            q.add(node.right);
    }
 
    if (dataNode != null)
    {
        int x = node.data;
        deleteDeepest(root, node);
        dataNode.data = x;
    }
}

//check whether the tree is binary search or not

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


static int maxValue(Node root) {
	if (root.right == null) {
		return root.data;
	} else {
		return maxValue(root.right);
	}
}

static int minValue(Node root) {
	if (root.left == null) {
		return root.data;
	} else {
		return minValue(root.left);
	}
}
    
 
// Driver code
public static void main(String args[])
{
    root = new Node(10);
    root.left = new Node(4);
    root.left.left = new Node(1);
    root.left.right = new Node(2);
    root.right = new Node(11);
    
 
    System.out.print("Inorder traversal " 
                   );
    inorderTraversal(root);
    System.out.println();
    System.out.println("Is the tree a BST? " + isBST(root));
    System.out.println("Print Root Reference: " + root);
 
}
}



	



