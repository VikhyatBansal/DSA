class path {

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

//Display all the paths from root to leaf

static void printPath(Node node) {
    int path[] = new int[1000];
    printPathsRecurs(node, path, 0);
}

static void printPathsRecurs(Node node, int path[], int pathLen) {
    if (node == null)
        return;

    /* append this node to the path array */
    path[pathLen] = node.data;
    pathLen++;

    /* it's a leaf, so print the path that led to here */
    if (node.left == null && node.right == null)
        printArr(path, pathLen);
    else {
        /* otherwise try both subtrees */
        printPathsRecurs(node.left, path, pathLen);
        printPathsRecurs(node.right, path, pathLen);
    }
}

/* Utility that prints out an array on a line. */
static void printArr(int integ[], int len) {
    int i;
    for (i = 0; i < len; i++) {
        System.out.print(integ[i] + " ");
    }
    System.out.println("");
    System.out.println();
}

public static void main(String[] args) {
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
    
    System.out.println("All the paths from root to leaf are: ");
    printPath(root);

    
}
}
