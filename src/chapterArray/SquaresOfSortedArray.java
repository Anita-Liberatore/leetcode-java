package chapterArray;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String[] args) {

        int[] arr = {-4,-1,0,3,10};

        int[] result = sortedSquares(arr);

        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] sortedSquares(int[] nums) {
        int[] result= new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length; i++) {
            result[j++]= nums[i]*nums[i];
        }

        Arrays.sort(result);

        return result;
    }

}
