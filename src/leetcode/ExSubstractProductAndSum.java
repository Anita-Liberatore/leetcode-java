package leetcode;

public class ExSubstractProductAndSum {
    public static void main(String[] args) {
        int res = substractProductAndSum(234);
    }

    public static int substractProductAndSum(int n) {
        String temp = Integer.toString(n);
        int[] nums = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++){
            nums[i] = temp.charAt(i) - '0';
        }

        int sum=0;
        int product=1;

        for(int j=0; j<nums.length; j++) {
            sum = sum+nums[j];
            product = product * nums[j];
        }

        return (product>sum) ? product-sum : sum-product;
    }
}
