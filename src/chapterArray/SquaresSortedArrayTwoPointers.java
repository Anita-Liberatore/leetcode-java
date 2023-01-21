package chapterArray;

public class SquaresSortedArrayTwoPointers {
	public static void main(String[] args) {
		int[] arr = {-7,-3,2,3,11}; 
		int[] result = sortedSquares(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	//solution one
	//	public static int[] sortedSquares(int[] nums) {
	//		int j = 0;
	//		for (int i = 0; i < nums.length; i++) {
	//			nums[j++]=nums[i]*nums[i];
	//		}
	//		Arrays.sort(nums);
	//
	//		return nums;
	//	}

	public static int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];
		int left = 0, right = nums.length - 1;
		int p = nums.length-1;
		while(left<=right) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				result[p] = nums[left] * nums[left];
				left++;
			} else {
				result[p] = nums[right] * nums[right];
				right--;
			}
			p--;
		}
		return result;
	}
}
