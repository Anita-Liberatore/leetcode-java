package chapterArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
 *
 */
public class FindAllNumbersDisappearedArray {

	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1}; 
		List<Integer> result = findDisappearedNumbers(arr);
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Integer> mapResult= new HashMap<>();

		for(int i=1; i<=nums.length; i++) {
			mapResult.put(i, i);
		}


		for(int i=0; i<nums.length; i++) {
			if(mapResult.containsKey(nums[i])) {
				mapResult.remove(nums[i]);
			}
		}
		
		for(Integer key: mapResult.keySet()) {
			result.add(key);
		}
		

		return result;

	}
}
