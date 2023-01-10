package chapterArray;

public class RemoveLastElementArray {
	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5,6};
		int[] newArray = new int[intArray.length];

		//remove the last element array
		
		int k = 0;

		for(int i = 0; i < intArray.length-1; i++) {
			newArray[k++] = intArray[i];
		}
				
		for(int i = 0; i < k; i++) {
		    System.out.println(newArray[i]);
		}
	}
}
