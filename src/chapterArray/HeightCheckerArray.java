package chapterArray;

import java.util.Arrays;

/**
 * Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
 *
 */
public class HeightCheckerArray {

	public static void main(String[] args) {
		int[] arr = {1,1,4,2,1,3}; //print 3
		int result = heightChecker(arr);
		System.out.println(result);
	}

	public static int heightChecker(int[] heights) {
		int[] expected = new int[heights.length];
		expected = sort(heights);
		int checkCount=0;
		for (int i = 0; i < heights.length; i++) {
			if(heights[i] != expected[i]) {
				checkCount++;
			}
		}

		return checkCount;
	}

	public static int[] sort(int [] array) {
		int[] newArray = new int[array.length];
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			newArray[k++]=array[i];
		}
		Arrays.sort(newArray);
		return newArray;
		
	}
}
