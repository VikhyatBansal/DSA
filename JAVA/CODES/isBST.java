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


// Driver code
public static void main(String args[])
{
    root = new Node(5);
    root.left = new Node(3);
    root.left.left = new Node(2);
    root.left.right = new Node(4);
    root.right = new Node(7);
    
 
    System.out.print("Inorder traversal ");
    inorderTraversal(root);
    System.out.println();
    System.out.println("Is the tree a BST? " + isBST(root));
 
}
}



	



