package leetcode;

public class ExPlusOne {
    public static void main(String[] args) {

        int array[] = {9,9};
        int[] result = plusOne(array);
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }


    public static int[] plusOne(int[] array) {
        int n = array.length;
        int[] newArray = new int[n+1];
        int j=newArray.length-1;

        for (int i = n - 1; i >= 0; i--) {
            if (array[i] < 9) {
                array[i]++;
                return array;
            } else {
                newArray[j--] = array[i] = 0;
                newArray[0]=1;
            }

            array[i]=0;
        }

        return newArray;
    }

}