package leetcode;

/**
 Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
 *
 */
public class Ex12FirstPalindromeArray {

	public static void main(String[] args) {
		String[] arr = {"abc","car","ada","racecar","cool"}; 
		String result = firstPalindrome(arr);
		System.out.println(result);
	}

	public static String firstPalindrome(String[] words) {
		String result = new String();
		
		for (int i = 0; i < words.length; i++) {

			char[] word = words[i].toCharArray();
			result = isPalindrome(word) ? words[i] : "";
			
			if(!result.isEmpty()) {
				return result;
			}
		}
		return result;
	}

	//two pointers
	public static Boolean isPalindrome(char[] word) {
		int left=0;
		int right=word.length-1;
		
		while(left<=right) {
			if(word[left]!=word[right]) {
				return false;
			}
			
			left++;
			right--;
		}

		return true;
	}
}


