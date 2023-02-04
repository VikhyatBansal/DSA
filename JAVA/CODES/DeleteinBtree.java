public class DeleteinBtree {
	
	class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	};

	Node root;

	DeleteinBtree() {
		root = null;
	}
	
	private Node insert_rec(int d, Node r) {
		if(r == null) {
			return new Node(d);
		}
		else {
			if(d<r.data)
				r.left = insert_rec(d,r.left);
			else
				r.right = insert_rec(d,r.right);
			return r;
		}
			
	}

	public void insert( int d) {
		root = insert_rec(d,root);
	}

	public boolean isLeaf(){
		return (root.right==null && root.left==null);
	}
	
	private void inorder_rec(Node r) {
		if(r==null){
			// System.out.print("-");
		}
		else {
			inorder_rec(r.left);
			System.out.print(r.data+" ");
			inorder_rec(r.right);
		}
	}

	public void inorder() {
		System.out.println("Inorder traversal of the binary tree after deletion is: ");
		inorder_rec(root);
		
		System.out.println();
	}

	private void preorder_rec(Node r) {
		if(r==null){
			// System.out.print("-");
		}
		else {
			System.out.print(r.data+" ");
			preorder_rec(r.left);
			preorder_rec(r.right);
			}
	}

	public void preorder() {
		System.out.println("Preorder traversal of binary tree after deletion is: ");
		preorder_rec(root);
		
		System.out.println();
	}

	private void postorder_rec(Node r) {
		if(r==null){
			// System.out.print("-");
		}
		else {
			postorder_rec(r.left);
			postorder_rec(r.right);
			System.out.print(r.data+" ");

		}
	}

	public void postorder() {
		System.out.println("Postorder traversal of binary tree after deletion is: ");
		postorder_rec(root);
		System.out.println();
	}


	public int min(Node r) {
		while(r.left != null)
			r=r.left;
		return r.data;
	}

	public int max(Node r) {
		while(r.right != null)
			r=r.right;
		return r.data;
	}


	private Node delete_rec(int key, Node r) {
		if(r==null)
			return r;
		else if(key<r.data) 
			r.left = delete_rec(key,r.left); 
		else if(key>r.data)
			r.right = delete_rec(key,r.right);
		else {
			if(r.left==null)
				return r.right;
			else if(r.right==null)
				return r.left;
			else {
				r.data = min(r.right);
				r.right = delete_rec(r.data,r.right);
			}
		}
		return r;

	}

	public void delete(int k){
		delete_rec(k,root);
	}


	public static void main(String []args){
		BinaryTreeNode b = new BinaryTreeNode();
		b.insert(5);
		b.insert(7);
		b.insert(6);
		b.insert(2);
		b.insert(10);


		/* Our tree from this input before insertion will look something like this
                   5
                /    \
               /      \
              /        \
            2           7
                      /   \
                     /     \
                    6      10
                      */

	    b.delete(5);

			/* Our tree after deletion of node with value 5 will look something like this
                   6
                /    \
               /      \
              /        \
            2           7
                          \
                           \
                           10
                      */

		b.inorder();
		b.preorder();
		b.postorder();
	}
}
