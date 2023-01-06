package chapterArray;

/**
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 *
 */
public class FindNumbersEvenNumberDigits {

    public static void main(String[] args) {
        //int arr[] = {555,901,482,1771};
        //System.out.println(findNumbers(arr)); print 1

        int arr[] = {12,345,2,6,7896};
        System.out.println(findNumbers(arr)); //print 2

    }

    public static int findNumbers(int[] nums) {
        int output = 0;

        for(int i = 0; i<nums.length; i++) {
            int length = String.valueOf(nums[i]).length();
            if(length%2==0) {
                output++;
            }
        }
        return output;

    }
}
