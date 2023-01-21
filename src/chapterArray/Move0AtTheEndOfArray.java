package chapterArray;

public class Move0AtTheEndOfArray {

	public static void main (String[] args) {
		int[] arr= {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		pushZerosToEnd(arr);
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	public static int[] pushZerosToEnd(int arr[]) {
		int count = 0; 

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i]; 
			}
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}
		
		return arr;
	}
}
