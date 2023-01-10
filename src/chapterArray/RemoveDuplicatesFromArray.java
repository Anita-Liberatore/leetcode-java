package chapterArray;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {

		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));
	}

	public static int removeDuplicates(int[] nums) {

		int k=0;

		for(int i=0; i<nums.length; i++) {
			if(i+1<nums.length) {
				if(nums[i]!=nums[i+1]) {
					nums[k++] = nums[i];
				} 
			} else {
				nums[k++] = nums[i];
			}
		}

		return k;
	} 
}
