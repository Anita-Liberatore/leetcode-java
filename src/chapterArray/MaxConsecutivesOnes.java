package chapterArray;

/**
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */
public class MaxConsecutivesOnes {

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; //initialize count
        int result = 0; //initialize max

        for (int i = 0; i < nums.length; i++) {

            // Reset count when 0 is found
            if (nums[i] == 0)
                count = 0;

                // If 1 is found, increment count
                // and update result if count becomes
                // more.
            else {
                count++;//increase count
                result = Math.max(result, count);
            }
        }

        return result;
    }
}