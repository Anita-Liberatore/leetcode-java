package chapterArray;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {12,3,4,5,2,32};
		System.out.println(linearSearch(arr, 5));
	}


	public static boolean linearSearch(int[] array, int element) {
		// Check for edge cases. Is the array null or empty?
		// If it is, then we return false because the element we're
		// searching for couldn't possibly be in it.
		if (array == null || array.length == 0) {
			return false;
		}

		// Carry out the linear search by checking each element,
		// starting from the first one.
		for (int i = 0; i < array.length; i++) {
			// We found the element at index i.
			// So we return true to say it exists.
			if (array[i] == element) {
				System.out.println("Element at index " +i);
				return true;
			}
		}

		// We didn't find the element in the array.
		return false;
	}
}