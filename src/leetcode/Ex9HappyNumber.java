package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ex9HappyNumber {

	public static void main(String[] args) {

		System.out.println(isHappy(19));
		System.out.println(isHappy(2));
	}

	public static boolean isHappy(int n) {

		Map<String, Integer> map = new HashMap<>();
		Integer sum = 0;
        String temp = Integer.toString(n);
		int[] numbers = new int[temp.length()];
				
        while (!map.containsKey(temp)) {
            sum = 0;
            String meme = temp;
            numbers = new int[temp.length()];
            for (int i = 0; i < temp.length(); i++)
			{
				numbers[i] = temp.charAt(i) - '0';
			}

			for (int i = 0; i < numbers.length; i++)
			{
				sum += numbers[i]*numbers[i];

			}
            if (sum == 1) {
                return true;
            }
            map.put(meme, sum);
            temp = sum.toString();
        }
        return false;
    }
}
