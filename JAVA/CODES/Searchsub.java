public class Searchsub {
	public static void main(String[]args) {
		String arr[]= {"A","T","G","C","T"};
		String subarr[]= {"A","G","C","T"};
		String temp[]= new String[2];
		String temp2[]= new String[3];
		for (int i = 0; i <arr.length-1; i++) {
			for (int j = 0; j <subarr.length-1 ; j++) {
				if (arr[i]==subarr[j] && arr[i+1]==subarr[j+1]) {
					System.out.println("common seqence with two elements");
					for (int k = 0; k <temp.length; k++) {
						temp[k]=subarr[j+k];
						System.out.println(temp[k]);
					}
					break;
				}
			}
		}
		for (int i = 0; i <arr.length-2; i++) {
			for (int j = 0; j <subarr.length-2; j++) {
				if (arr[i]==subarr[j] && arr[i+1]==subarr[j+1] && arr[i+2]==subarr[j+2]) {
					System.out.println("the common seqence with three elemets");
					for (int k = 0; k <temp2.length; k++) {
						temp2[k]=subarr[j+k];
						System.out.println(temp2[k]);
					}
					break;
				}
			}
		}
	}
}