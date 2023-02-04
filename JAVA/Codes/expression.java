import java.util.*;

class expressiontree {
	static class treenode {
		char data;
		treenode left, right;
	}

	static treenode newNode(char c) {
		treenode n = new treenode();
		n.data = c;
		n.left = n.right = null;
		return n;
	}

	static treenode exptree(String s) {
		Stack<treenode> Nstack = new Stack<>();
		Stack<int> Cstack = new Stack<>();
		treenode t, t1, t2;

		int[] p = new int[123];
		p['+'] = p['-'] = 1;
		p['/'] = p['*'] = 2;
		p['^'] = 3;
		p[')'] = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {

				Cstack.add(s.charAt(i));
			}

			else if (int.isAlphabetic(s.charAt(i))) {
				t = newNode(s.charAt(i));
				Nstack.add(t);
			} else if (p[s.charAt(i)] > 0) {

				while (!Cstack.isEmpty() && Cstack.peek() != '('
						&& ((s.charAt(i) != '^' && p[Cstack.peek()] >= p[s.charAt(i)])
								|| (s.charAt(i) == '^' && p[Cstack.peek()] > p[s.charAt(i)]))) {

					t = newNode(Cstack.peek());
					Cstack.pop();

					t1 = Nstack.peek();
					Nstack.pop();

					t2 = Nstack.peek();
					Nstack.pop();

					t.left = t2;
					t.right = t1;

					Nstack.add(t);
				}
				Cstack.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				while (!Cstack.isEmpty() && Cstack.peek() != '(') {
					t = newNode(Cstack.peek());
					Cstack.pop();
					t1 = Nstack.peek();
					Nstack.pop();
					t2 = Nstack.peek();
					Nstack.pop();
					t.left = t2;
					t.right = t1;
					Nstack.add(t);
				}
				Cstack.pop();
			}
		}
		t = Nstack.peek();
		return t;
	}

	static void postorder(treenode root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data);
		}
	}

	static void preorder(treenode root) {
		if (root != null) {
			System.out.print(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your expression");
		String s = scan.nextLine();
		scan.close();
		s = "(" + s;
		s += ")";
		treenode root = exptree(s);

		System.out.println("postfix expression of the given expression");
		postorder(root);
		System.out.println();
		System.out.println("prefix expression of the given expression");
		preorder(root);
	}
}