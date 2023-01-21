package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
 *
 *
 *Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
 */
public class Ex11IntersectionArray {
	public static void main(String[] args) {
//		int[] nums1 = {1,2,2,1}; int[] nums2= {2,2};
//		int[] result = intersection(nums1, nums2); //print [2];
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
		
		int[] nums3 = {4,9,5}; int[] nums4= {9,4,9,8,4};
		int[] result2 = intersection(nums3, nums4); //print [9,4];
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}
//		
		
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> setNums1 = new ArrayList<>();
        for (int num : nums2) {
        	setNums1.add(num);
        }
        List<Integer> setResult = new ArrayList<>();
        for (int num : nums1) {
            if (setNums1.contains(num)) {
            	setResult.add(num);
            }
        }
        int[] res = new int[setResult.size()];
        int i = 0;
        for (int num : setResult) {
            res[i++] = num;
        }
        return res;
	}

}

