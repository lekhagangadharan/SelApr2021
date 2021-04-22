package week1.assignments;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		
		if(text1.length() == text2.length())
		{
			char[] arrayOne = text1.toCharArray();
			char[] arrayTwo = text2.toCharArray();
			
			Arrays.sort(arrayOne);
			Arrays.sort(arrayTwo);
			
			if(Arrays.equals(arrayOne, arrayTwo))
			{
				System.out.println(text1 + "and" + text2 + "are anagrams");
			}
			else
			{
				System.out.println(text1 + "and" + text2 + "are not anagrams");
			}
		}

	}

}
