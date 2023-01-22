package leetcode;

public class ExTwoSumII {

    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int[] result = twoSum(nums, 6);

        for (int i:result ) {
            System.out.println(i);
        }
    }

        public static int[] twoSum(int[] numbers, int target) {

            int start = 0;
            int end = numbers.length-1;
            int[] result = new int[2];

            while(start<end) {

                if(numbers[start]+numbers[end]==target) {
                    result[0] = start+1;
                    result[1] = end+1;

                    return result;
                }

                if(numbers[start]+numbers[end]>target){
                    end--;
                } else {
                    start++;
                }
            }

            return result;
        }

}
