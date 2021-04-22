package week1.assignments;

public class FindSumOfDigits {

	public static void main(String[] args) {
		int num = 123;
		int sum= 0;
		int remainder;
		
		while(num > 0)
		{
			remainder = num%10;
			sum = sum+remainder;
			num = num/10;
		}
		System.out.println(sum);

	}

}
