package leetcode;

public class Ex4BinarySearch {

    public static void main(String[] args) {

        int[] arrTwo = {1,2,3,4,6,7};
        int numTwo = 2;
        System.out.println(search(arrTwo,numTwo));
    }

    public static int search(int[] arr, int num) {
        int start = 0, end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {

            // Check if x is present at mid
            if (arr[mid] == num)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < num)
                start = mid + 1;

                // If x is smaller, ignore right half
            else
                end = mid - 1;

            mid = (start + end) / 2;

        }

        // if we reach here, then element was
        // not present
        return -1;
    }
}
