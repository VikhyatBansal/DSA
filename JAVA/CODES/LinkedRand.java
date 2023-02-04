//import java.io.*;
//import java.util.Arrays;
//import java.util.Scanner;
//
//// Java program to implement
//// a Singly Linked List
//public class LinkedRand {
//
//	Node head; // head of list
//
//	// Linked list Node.
//	// This inner class is made static
//	// so that main() can access it
//	static class Node {
//
//		int data;
//		Node next;
//
//		// Constructor
//		Node(int d)
//		{
//			this.data = d;
//			this.next = null;
//		}
//	}
//
//	// Method to insert a new node
//	public static LinkedRand insert(LinkedRand list, int data)
//	{
//		// Create a new node with given data
//		Node new_node = new Node(data);
//		new_node.next = null;
//
//		// If the Linked List is empty,
//		// then make the new node as head
//		if (list.head == null) {
//			list.head = new_node;
//		}
//		else {
//			// Else traverse till the last node
//			// and insert the new_node there
//			Node last = list.head;
//			while (last.next != null) {
//				last = last.next;
//			}
//
//			// Insert the new_node at last node
//			last.next = new_node;
//		}
//
//		// Return the list by head
//		return list;
//	}
//	public int LastElement() {
//		Node node = head;
//		while(node.next!=null) {
//			node = node.next;
//
//		}
//		System.out.println("The last element is: "+node.data);
//		return node.data;
//	}
//	public void findMatch(int t) {
//		Node node = head;
//		int count = 0;
//		while (node.next != null) {
//			for (count = 0; count < 1000001; count++) {
//				if (node.data == t) {
//					System.out.println("Match of " + t + " found at location " + count);
//
//				}
//				if (count == 100000) {
//					if (node.data == t) {
//						System.out.println("Match of " + t + " found at " + count);
//					}
//
//				count += 1;
//				node = node.next;
//
//
//			}
//
//			}
//		}
//	}
//
//	// Method to print the LinkedList.
//	public static void printList(LinkedRand list)
//	{
//
//		Node currNode = list.head;
//
//		System.out.println("LinkedList: ");
//
//		// Traverse through the LinkedList
//		while (currNode != null) {
//			// Print the data at current node
//			System.out.println(currNode.data + " ");
//
//			// Go to next node
//			currNode = currNode.next;
//		}
//	}
//
//	public static void main(String[] args)
//	{   long start = System.currentTimeMillis();
//
//
//        int min = 1;
//        int max = 100000;
//        int i = 0;
//
//        Scanner s = new Scanner(System.in);
//
//		/* Start with the empty list. */
//		LinkedRand list = new LinkedRand();
//        for ( i = 0; i < 100000; i++) {
//
//            int range = (max - min) + 1;
//            int randomNum = (int)(Math.random() * range) + min;
//            list = insert(list, randomNum);
//
//
//	}
//		// int randomNum = LinkedRand list;
//    // getDataFromSpecifiedLocation(list,randomNum, 5);
//     printList(list);
//     int target = list.LastElement();
//     list.findMatch(target);
//
//
//    long end = System.currentTimeMillis();
//    System.out.println("Total time taken by the program to execute is: " +
//            ((end - start)/1000) + " seconds");
//}
//}

import java.util.Random;
public class LinkedRand {

	static class Node{
		int data;
		Node next;
		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;
	public void insertNode(int d) {
		Node object = new Node(d);
		if(head == null) {
			head = object;
		}
		else {
			Node node = head;
			while(node.next!=null) {
				node = node.next;
			}
			node.next = object;
		}
		tail = object;
	}
		public static void printList(LinkedRand list)
	{

		Node node = list.head;

		System.out.println("LinkedList: ");

		// Traverse through the LinkedList
		while (node != null) {
			// Print the data at current node
			System.out.println(node.data + " ");

			// Go to next node
			node = node.next;
		}
	}
	public int retrieveLastElement() {
		Node node = head;
		while(node.next!=null) {
			node = node.next;
		}
		System.out.println("Last element in linked list is:" +node.data);
		return node.data;
	}
	public void findMatch(int t) {
		Node node = head;
		int count = 0;
		while (node.next != null) {

				if (node.data == t) {
					System.out.println("Match of " + t + " found at location " + count);
				}



				if (count == 99999) {
						System.out.println("Match of " + t + " found at location" + count);

				}
			count += 1;
			node = node.next;
			}
		}

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Random obj = new Random();
		LinkedRand list = new LinkedRand();
		for(int i = 0;i <= 100000;i++) {
			list.insertNode(obj.nextInt(100000));
		}
		printList(list);
		int target = list.retrieveLastElement();
		list.findMatch(target);

		long end=System.currentTimeMillis();
		float time=(end-start)/1000;
		System.out.println("the time taken is "+(time)+" seconds");
	}
}


