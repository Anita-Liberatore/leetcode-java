package chapterArray;

/**
 * Input: nums = [3,1,2,4]
   Output: [2,4,3,1]
 *
 */
public class SortArrayByParity {

	public static void main(String[] args) {
		int[] arr = {3,1,2,4};
		sortArrayByParity(arr);
	}

	public static int[] sortArrayByParity(int[] nums) {
		int[] result = new int[nums.length];
		int j=0;
		int p=nums.length-1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2==0) {
				result[j++] = nums[i];
			} else {
				result[p--] = nums[i];
			}
		}

		return result;
	}
}
