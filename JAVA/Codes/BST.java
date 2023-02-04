// binary search tree
import java.util.*;
public class BST {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    
    static Node root;
    static Node node = root;

    static void insert(int data) {
        root = insertRec(root, data);
    }

    static Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    static void inorder() {
        inorderRec(root);
    }   

    static void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
        
        
    }    
}