package chapterArray;

import java.util.Arrays;

public class SearchForItemsInArray {

	public static void main(String[] args) {
		int[] arr = {10,2,3,5};
		System.out.println(checkIfExist(arr)); //true
		
		int[] arr2 = {-2,0,10,-19,4,6,-8};
		System.out.println(checkIfExist(arr2)); //false


	}

	public static boolean checkIfExist(int[] arr) {
		Arrays.sort(arr);

		for(int i = 0; i<arr.length; i++) {
			for (int j = 1; j<arr.length; j++) {
				int op = 2 * arr[j];

				if (op == arr[i] && i != j) {
					return true;
				}
			}

		}

		return false;
	}

}
