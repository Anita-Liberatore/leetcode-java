package leetcode;

public class Ex13BinarySearchSquareNumber {

	public static void main(String[] args) {
		int num = 14;
		
		System.out.println(isPerfectSquare(num));
		
	}
	
	public static boolean isPerfectSquare(int num) {
		
		int start = 1;
		int end = num;
		
		int mid = (start+end)/2;
		
		while(start<=end) {
			
			if(mid*mid==num) {
				return true;
			}
			
			if(mid*mid>num) {
				end--;
			} else {
				start++;
			}
			
			mid=(start+end)/2;
		}
		return false;
	}
}


