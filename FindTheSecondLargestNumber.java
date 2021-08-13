package Classroom;

import java.util.Arrays;

public class FindTheSecondLargestNumber {

	public static void main(String[] args) {
		int[] arr= {3,4,6,7,9};
	
		Arrays.sort(arr);
		System.out.println("Sortarray");
		
		
		int i=arr.length-2;
		System.out.println("TheSecondLargestNumberis"+arr[i]);
		// TODO Auto-generated method stub

	}

}
