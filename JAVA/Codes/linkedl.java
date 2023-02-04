package clas;

public class linkedl {
	public node head;

	public node in(char data) {

		node node = new node();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			node n = new node();
			n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;

		}
		return head;
	}

	public void clear() {
		head = null;
	}

	public void show() {
		node n = new node();
		n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public node out(char d) {
		node n = new node();
		node p = new node();
		n = head;
		p = null;
		if (n.next != null && n.data == d) {
			head = n.next;
			return head;
		}
		while (n.next != null) {
			if (n.data == d) {
				p.next = n.next;
			}
			p = n;
			n = n.next;
			if (n.next == null && n.data == d) {
				p.next = null;
				return head;
			}
		}
		return head;

	}

	public char valat(int i) {
		node n = new node();
		n = head;
		int c=0;
		while (n.next != null) {
			if (c==i ) {
				break;
			}
			n=n.next;
		}
		return n.data;
	}

	public int length() {
		int len = 0;
		node n = new node();
		n = head;
		while (n.next != null) {
			len = len + 1;
		}
		return len;

	}

	public void add(int i, char d) {
		node n = new node();
		node p = new node();
		node node = new node();
		p = null;
		node.data = d;
		n = head;

		if (i == 0) {
			head = node;
			node.next = n;
			return;
		}
		for (int j = 0; j < i; j++) {
			p = n;
			n = n.next;
		}
		p.next = node;
		node.next = n;
	}
}