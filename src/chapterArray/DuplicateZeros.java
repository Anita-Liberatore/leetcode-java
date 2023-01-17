package chapterArray;

/**
 * Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
 *
 */
public class DuplicateZeros {

	public static void main(String[] args) {
		int[] arr = {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
	}

	public static void duplicateZeros(int[] arr) {

		int countZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) 
				countZero++;
		}
		
		int len = arr.length + countZero;
		for (int i = arr.length - 1, j = len - 1; i < j; i--, j--) {
			if (arr[i] != 0) {
				if (j < arr.length) 
					arr[j] = arr[i];
			} else {
				if (j < arr.length) 
					arr[j] = arr[i];
				j--;
				if (j < arr.length) 
					arr[j] = arr[i]; //copy twice when hit '0'
			}
		}
	}
}
