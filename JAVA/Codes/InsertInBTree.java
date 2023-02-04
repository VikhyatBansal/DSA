import java.util.LinkedList;
import java.util.Queue;

public class InsertInBTree {
    // Java program to insert element in binary tree
	/* A binary tree node has key, pointer to
	left child and a pointer to right child */
	static class Node {
		int key;
		Node left, right;

		// constructor
		Node(int key)
		{
			this.key = key;
			left = null;
			right = null;
		}
	}
	static Node root;
	static Node temp = root;

	/* Inorder traversal of a binary tree*/
	static void inorder(Node temp)
	{
		if (temp == null)
			return;

		inorder(temp.left);
		System.out.print(temp.key + " ");
		inorder(temp.right);
	}

	static void preorder(Node temp)
	{
		if (temp == null) 
			return;
		    
		System.out.print(temp.key + " ");
		preorder(temp.left);
		preorder(temp.right);
				
	}
    
	static void postorder(Node temp)
	 {
		if(temp == null)
			return;
			
		postorder(temp.left);
		postorder(temp.right);
		System.out.print(temp.key+" ");
		
	}

	/*function to insert element in binary tree */
	static void insert(Node temp, int key)
	{

		if (temp == null) {
			root = new Node(key);
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);

		// Do level order traversal until we find
		// an empty place.ei
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp.left == null) {
				temp.left = new Node(key);
				break;
			}
			else
				q.add(temp.left);

			if (temp.right == null) {
				temp.right = new Node(key);
				break;
			}
			else
				q.add(temp.right);
		}
	}

	// Driver code
	public static void main(String args[])
	{
          /* Our tree from this input before insertion will look something like this
                69
              /    \
             /      \
            /        \
        9              5
      /               /   \
     /               /     \
   96               3   
                      */

		root = new Node(69);
		root.left = new Node(9);
		root.left.left = new Node(96);
		root.right = new Node(5);
		root.right.left = new Node(3);
		

		System.out.print(
			"Postorder traversal before insertion: ");
		postorder(root);

		int key = 12;
		insert(root, key);

        int key1 = 19;
        insert(root, key1);

        /* Our tree from this input before insertion will look something like this

                69
              /    \
             /      \
            /        \
        9              5
      /   \           /   \
     /     \         /     \
   96      12       3       
   
                69
              /    \
             /      \
            /        \
        9              5
      /   \           /   \
     /     \         /     \
   96      12       3       19
                      */
                      
		System.out.print(
			"\nPostorder traversal after insertion: ");
		postorder(root);
	}
}

