package week1.day2;

import java.util.Arrays;

public class FindSecondLargestNumInArray {

	public static void main(String[] args) {
		
		
		int[] arr = {3,2,11,4,6,7};
		
		//arranging the array in ascending order
		Arrays.sort(arr);
		
		int len = arr.length;
		System.out.println("Length of the Array is- " + len);
		
		System.out.println("Second Largest Number in the Array is- " + arr[len-2]);
	}

}
