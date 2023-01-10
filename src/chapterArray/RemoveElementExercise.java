package chapterArray;

/**
 * Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 */
public class RemoveElementExercise {

	public static void main(String[] args) {
		int[] intArray = {2,2,3};
		int val = 3;
		System.out.println(removeElement(intArray, val));
	}

	public static int removeElement(int[] nums, int val) {

		int k = 0;

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[k++] = nums[i];
			} 
		}

		return k;
	}
}
