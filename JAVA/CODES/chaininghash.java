
import java.util.Scanner;

public class chaininghash {
	public class node {
		char data;
		node next;

		public void Node(char da) {
			data = da;
			next = null;

		}
	}

	static node[] hash = new node[10];

	public int hasher(char c) {
		int i = c;
		int ind = i % hash.length;
		node n = new node();
		n.data = c;
		if (hash[ind] != null) {
			node node = hash[ind];
			while (node.next != null) {
				node = node.next;
			}
			node.next = n;
		} else {
			hash[ind] = n;
		} 
		return ind;
	}

	public void disphashtable() {
		System.out.println("The Hash table is ");
		for (int i = 0; i < hash.length; i++) {
			if (hash[i] == null) {
				System.out.println(hash[i]);
			} else {
				if (hash[i].next == null) {
					System.out.println(hash[i].data + "-> ");
				} else {
					node n = new node();
					n = hash[i];
					while (n != null) {
						System.out.print(n.data + "-> ");
						n = n.next;
					}
					System.out.println(" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		chaininghash obj = new chaininghash();
		Scanner scan = new Scanner(System.in);

		System.out.println("input a word");
		String str = scan.next();

		scan.close();
		for (int i = 0; i < str.length(); i++) {
			int j = str.charAt(i);
			System.out.println("ascii value of " + str.charAt(i) + " is " + j);
			System.out.println("hash index of " + str.charAt(i) + " is " + obj.hasher(str.charAt(i)));
			System.out.println();
		}
		obj.disphashtable();
	}
}
