package leetcode;

public class SqrtBinarySearchOlogn {

	public static void main(String[] args) {
		int x = 8;
		System.out.println(mySqrt(x));
	}
	
	public static int mySqrt(int x) {
        int l = 1;
        int r = x;

        while(l <= r){
            int mid = (l + r) / 2;

            if(x / mid == mid){
                return mid;
            } else if(mid > x / mid){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return r;
    }
}
