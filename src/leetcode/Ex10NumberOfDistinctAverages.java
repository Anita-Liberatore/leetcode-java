package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Input: nums = [4,1,4,0,3,5]
Output: 2
Explanation:
1. Remove 0 and 5, and the average is (0 + 5) / 2 = 2.5. Now, nums = [4,1,4,3].
2. Remove 1 and 4. The average is (1 + 4) / 2 = 2.5, and nums = [4,3].
3. Remove 3 and 4, and the average is (3 + 4) / 2 = 3.5.
Since there are 2 distinct numbers among 2.5, 2.5, and 3.5, we return 2.
 *
 */
public class Ex10NumberOfDistinctAverages {

	public static void main(String[] args) {
		//int[] nums = {4,1,4,0,3,5};
		//System.out.println(distinctAverages(nums));
		int[] nums1 = {1,100};
		System.out.println(distinctAverages(nums1));

	}
	
	  public static int distinctAverages(int[] nums) {
	        Set<Double> numsAverage = new HashSet<>();
	        Arrays.sort(nums);
	        
	        for (int i = 0; i < nums.length; i++) {
				
				int first = nums[i];
				int  last = nums[nums.length-i-1];
				
				double sum = first + last;
				double average = sum/2;
				numsAverage.add(average);
			}
	        
	        return numsAverage.size();
	  }
}
