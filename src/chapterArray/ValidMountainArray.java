package chapterArray;

import java.util.Arrays;

public class ValidMountainArray {

	public static void main(String[] args) {
//		int[] nums1 = {0,1,2,3,4,5,6,7,8,9}; // print false
//		System.out.println(validMountainArray(nums1));
//
//		int[] nums2 = {2,1}; // print false
//		System.out.println(validMountainArray(nums2));
//
//		int[] nums3 = {1,3,2}; // print true
//		System.out.println(validMountainArray(nums3));

		int[] nums4 = {0,3,2,1}; // print true
		System.out.println(validMountainArray(nums4));

		int[] nums5 = {0,1,2,1,2}; // print false
		System.out.println(validMountainArray(nums5));


	}

	public static boolean validMountainArray(int[] arr) {

		if (arr.length < 3) return false;
		int start = 0;
		int end = arr.length-1;
		while (start < end) {
			if (arr[start+1] > arr[start]) {
				start++;
			} else if (arr[end-1] > arr[end]) { 
				end--;
			} else {
				break;
			}
		}
		return start != 0 && end != arr.length-1 && start == end;
	}
}
