// JAVA implementation of tree using array
// numbering starting from 0 to n-1.

import java.io.*;
import java.lang.*;
import java.util.*;

class BTreeArr {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of class 2 inside main() method
		Array_imp tree = new Array_imp();

		//Setting root node

    /* Our tree from this input will look something like this*/
    /*         A(0)
              /    \
             /      \
            /        \
      B(1)            C(2)
      /   \            /   \
     /     \          /     \
D(3)       E(4)     F(5)    G(6)
 /   \     /   \    /       /   \
 H(7)     I(8)                            */


		tree.Root("A");

		tree.set_Left("B", 0);
		tree.set_Right("C", 0);
		tree.set_Left("D", 1);
		tree.set_Right("E", 1);
		tree.set_Left("F", 2);
        tree.set_Right("G", 2);
        tree.set_Left("H", 3);
        tree.set_Left("I", 4);
		tree.print_Tree();
	}
}

class Array_imp {

	// Member variables of this class
	static int root = 0;
	static String[] str = new String[10]; //Array is limited to n amount of nodes

	public void Root(String key)
  { str[0] = key; }

	public void set_Left(String key, int root)
	{
		int t = (root * 2) + 1;

		if (str[root] == null) {
      System.err.println();
			System.out.printf(
				"Can't set child at " +t+", no parent found");
		}
		else {
			str[t] = key;
		}
	}

	public void set_Right(String key, int root)
	{
		int t = (root * 2) + 2;

		if (str[root] == null) {
      System.out.println();
			System.out.printf(
				"Can't set child at " +t+", no parent found"
				);
		}
		else {
			str[t] = key;
		}
	}

	public void print_Tree()
	{
    System.out.println();

		// Iterating using for loop
		for (int i = 0; i < 10; i++) {
			if (str[i] != null)
				System.out.print(str[i] + " ");
			else
				System.out.print("-");  // printing '-' if node is null and a node is missing in connection.
		}
	}
}
