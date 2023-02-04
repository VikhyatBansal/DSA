
import java.util.Scanner;

public class linprobhash {

	char[] hash = new char[10];

	public int hash(char c) {
		int i = c;
		int ind = i%hash.length;
		if (hash[ind] != 0) {
			while (ind < hash.length) {
				if (hash[ind] == 0) {
					break;
				} else {
					if (ind == hash.length - 1) {
						ind = 0;
					} else {
						ind += 1;
					}
				}

			}
		}
		hash[ind] = c;
		return ind;
	}

	public void disphashtable() {
		System.out.println("The Hash table is ");
		for (int i = 0; i < hash.length; i++) {
			System.out.print(" " + hash[i]);
		}
	}

	public static void main(String[] args) {
		linprobhash obj = new linprobhash();
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
