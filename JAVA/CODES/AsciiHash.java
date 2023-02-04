package clas;

import java.util.Scanner;

public class AsciiHash {

	char[] hash = new char[10];

	public int hash(char c) {
		int i = c;
		hash[(2*(i+1)) % hash.length] = c;
		return (2*(i+1)) % hash.length;
	}

	public void disphashtable() {
		System.out.println("The Hash table is ");
		for (int i = 0; i < hash.length; i++) {
			System.out.print(" " + hash[i]);
		}
	}

	public static void main(String[] args) {
		AsciiHash obj = new AsciiHash();
		Scanner scan = new Scanner(System.in);

		System.out.println("input a word");
		String str = scan.next();

		for (int i = 0; i < str.length(); i++) {
			int j = str.charAt(i);
			System.out.println("ascii value of " + str.charAt(i) + " is " + j);
			System.out.println("hash index of " + str.charAt(i) + " is " + obj.hash(str.charAt(i)));
		}

		obj.disphashtable();
		scan.close();
	}
}
