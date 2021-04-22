package week1.assignments;

public class SumOfDigits {

	
	public static void main(String[] args) {
	

		int num = 123;
		int sum=0;
		int remainder;
		int quotient;
		
		while(num>0)
		{
			remainder = num%10;
			System.out.println(remainder);
			
			sum = sum + remainder;
			System.out.println(sum);
			
			quotient = num/10;
			System.out.println(quotient);
		}
		System.out.println(sum);
	}

}
