package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex3MajorityElement {
    public static void main(String[] args) {
        int[] array = {4,1,1};
        int[] arrayTwo = {2,2,3,3};
        System.out.println(majorityElement(array));
        System.out.println(majorityElement(arrayTwo));

    }


    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
