package leetcode;

import java.util.Arrays;

/**
 * 
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
	You must implement a solution with a linear runtime complexity and use only constant extra space.
 *Input: nums = [2,2,1]
  Output: 1
  
  Input: nums = [4,1,2,1,2]
  Output: 4
 */
public class Ex1SingleNumber {

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,2,3};
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {

		Arrays.sort(nums);
		int i = 0;
		while (i < nums.length - 2) {
			if (nums[i] == nums[i+1]) {
				i = i + 2;
			} else {
				return nums[i];
			}
		}
		return nums[nums.length - 1];

	}
}
