package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		//array declaration
		//int[] num = new int[3];
		
		//to assign data to a array
		
		int[] num = {10, 2, 5, 89, 90, 25, 100, 120};
		
		//to get length 
		int len = num.length;
		//to get single data from array	
		//System.out.println(num[1]);
		
		//to sort array values in ascending order
		Arrays.sort(num);
		
		//to get all the data from array
		for(int i=0 ; i<=len ; i++)
		{
			System.out.println(num[i]);
		}
		
	
		
		

	}

}
