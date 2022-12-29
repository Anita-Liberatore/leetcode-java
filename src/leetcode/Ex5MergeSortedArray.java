package leetcode;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote
 * the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class Ex5MergeSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int m = 3;

        int[] arrtwo = {2,5,6};
        int n = 3;

        merge(arr, m, arrtwo, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;

        for(int i=0; i<m; i++) {
            nums1[k++] = nums1[i];
        }



        for(int j=0; j<n; j++) {
                nums1[k++] = nums2[j];
        }

        Arrays.sort(nums1);

        for(int p = 0; p<nums1.length; p++) {
            System.out.println(nums1[p]);
        }
    }
}
