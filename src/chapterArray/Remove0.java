package chapterArray;

import java.util.Arrays;

/**
 * Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 *
 */
public class Remove0 {

	public static void main(String[] args) {
//		int[] arr = {0,1};
//		moveZeroes(arr);
		
		int[] arr = {0,1,0,3,12};
		moveZeroes(arr);
	}
	
	 public static void moveZeroes(int[] nums) {
		 	int countZero=0;
		 	int newI=0;
	        for (int i = 0; i < nums.length; i++) {
				if(nums[i]!=0) {
					nums[newI] = nums[i];
					newI++;
				} else {
					countZero++;
				}
			}
	        
	        int k = nums.length-1;
	        
	        for (int i = 0; i < countZero; i++) {
	        	nums[k]=0;
	        	k--;
			}
	        
	        for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
	 }
	
	
}
