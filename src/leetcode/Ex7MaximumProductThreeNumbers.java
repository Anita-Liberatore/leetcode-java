package leetcode;

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int r = nums[n-1] * nums[n-2] * nums[n-3]; //to check right subarray
        int l = nums[0] * nums[1] * nums[n-1]; //to check left subarray
        return Math.max(l,r);

    }
}

class Ex7MaximumProductThreeNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {-100,-2,-3,1};

        int result = solution.maximumProduct(nums);
        System.out.println(result);
    }
}
