import java.util.*;
public class Main_Page {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr [] = new int[5];
		System.out.println("Enter 5 numbers in an array");
		for(int a = 0 ; a<5 ; a++) {
	                arr[a] = input.nextInt(); }
		        TwoExtremeValue(arr); }
	public static void TwoExtremeValue(int [] arr) {
		        int Max = arr[0];
		for(int a = 0 ; a<arr.length ; a++) {
			if(Max < arr[a]) {
			Max = arr[a]; } }
		System.out.println("Maximum Value is : "+Max);
		        int Min = Max ;
		for(int a = 0 ; a<arr.length ; a++) {
			if(Min>arr[a]) {
			Min = arr[a]; } }
		System.out.println("Minimium Value is : "+Min); }
        }
