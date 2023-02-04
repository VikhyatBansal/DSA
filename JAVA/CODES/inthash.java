package clas;

public class inthash {
	static int[] arr = { 10, 3, 1, 11, 4, 7, 8, 2, 0 };
	static int[] hash = new int[9];

	public int hash(int i) {
		int ind = (((2 * i) + 50) % hash.length);
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
		hash[ind] = i;
		return ind;
	}

	public void disphashtable() {
		System.out.println("The Hash table is ");
		for (int i = 0; i < hash.length; i++) {
			System.out.print(hash[i] + " ");
		}
	}

	public static void main(String[] args) {
		inthash obj = new inthash();

		for (int i = 0; i < arr.length; i++) {
			System.out.println("hash index of " + arr[i] + " is " + obj.hash(arr[i]));
		}

		obj.disphashtable();
	}
}