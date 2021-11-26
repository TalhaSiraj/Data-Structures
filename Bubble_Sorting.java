public class Bubble_Sorting {
	public static void main(String[] args) {
		   int arr[] = {12,45,10,35,65,8,70};
		   bubble_sorting(arr);
		for(int k = 0 ; k<arr.length ; k++) {
		   System.out.println(arr[k]); } }
	private static void bubble_sorting(int[] arr) {
		   int num =0;
		for(int i = 0 ; i < arr.length ; i++) {
		for(int j = 1 ; j<(arr.length-i); j++) {
		   if(arr[j]<arr[j-1]) {
                   num = arr[j-1];
		   arr[j-1] = arr[j];  
                   arr[j] = num; } } }
	}





