package leetcode;

public class Ex16SignOfTheProductOfAnArray {

	public static void main(String[] args) {
		int[] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
		System.out.println(arraySign(nums));
	}

	public static int arraySign(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) {
				return 0;
			}
			
			if(nums[i]<0) {
				return -1;
			}
		}

		return 1;
	}
}
