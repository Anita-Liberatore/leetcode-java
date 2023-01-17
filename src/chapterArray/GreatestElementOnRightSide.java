package chapterArray;


public class GreatestElementOnRightSide {

	public static void main(String[] args) {
		int[] arr = {17,18,5,4,6,1};
		int[] result = replace(arr);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] replace(int[] arr) {
		int max = -1;        
		for(int i=arr.length-1;i>=0;i--){
			int element = arr[i];
			arr[i]= max;
			if(max<element){
				max = element ;
			}
		}
		return arr;
	}
}
