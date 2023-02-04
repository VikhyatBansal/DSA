package clas;

import assign.treenode;

public class maxheapify {

	void heapify(int arr[]) {
		maxheapify h = new maxheapify();
		h.largest(arr);
		int temp;
		for (int i = 1; i <= arr.length; i++) {
			if (2 * i + 1 < arr.length && 2 * i + 2 < arr.length) {
				if (arr[i] < arr[2 * i + 1] || arr[i] < arr[2 * i + 2]) {
					if (arr[2 * i + 1] > arr[2 * i + 2]) {
						temp = arr[i];
						arr[i] = arr[2 * i + 1];
						arr[2 * i + 1] = temp;
					} else if (arr[2 * i + 1] < arr[2 * i + 2]) {
						temp = arr[i];
						arr[i] = arr[2 * i + 2];
						arr[2 * i + 2] = temp;
					}
				}
			}
		}

	}

	void largest(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			if (arr[0] < arr[i]) {
				temp = arr[i];
				arr[i] = arr[0];
				arr[0] = temp;
			}
		}
	}

	public void show(int[] arr) {
		System.out.println("Array represetation of the heap");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public treenode treeify(int[] arr, int i) {
		treenode root = null;
		if (i < arr.length) {
			root = new treenode(arr[i]);

			root.left = treeify(arr, 2 * i + 1);

			root.right = treeify(arr, 2 * i + 2);
		}
		return root;
	}

	public void inOrder(treenode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	public static void main(String[] args) {
		maxheapify heap = new maxheapify();
		int[] arr = { 2, 3, 4, 5, 6, 7, 10 };
		heap.heapify(arr);
		heap.show(arr);
	}
}
