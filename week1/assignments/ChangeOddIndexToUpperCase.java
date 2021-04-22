package week1.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test= "changeme";
		
		int stringLen = test.length();
		System.out.println("The length of the string is- " + stringLen);
		
		for(int i=0 ; i< stringLen ; i++)
		{
			
			if(i%2 == 0)
			{
				System.out.print(test.toUpperCase().charAt(i));
			}
			else
			{
				System.out.print(test.charAt(i));
			}
		}

	}

}
