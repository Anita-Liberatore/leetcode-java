package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
2 is 
the missing number in the range since it does not appear in nums.
 *
 */
public class Ex8MissingNumber {

	public static void main(String[] args) {
		int[] arr = {3,0,1};
		System.out.println(missingNumber(arr));
	}
	
	public static int missingNumber(int[] nums) {
        int missingNumber = 0;
		Map<Integer, Integer> mapResult= new HashMap<>();

		for(int i=0; i<=nums.length; i++) {
			mapResult.put(i, i);
		}


		for(int i=0; i<nums.length; i++) {
			if(mapResult.containsKey(nums[i])) {
				mapResult.remove(nums[i]);
			}
		}
		
		for(Integer key: mapResult.keySet()) {
			missingNumber = key;
		}
		
		return missingNumber;
    }
}
