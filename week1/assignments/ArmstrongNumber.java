package week1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int input = 200;
		int sum=0;
		int original;
		int calculated;
		int remainder;
		
		
		original=input;
		while(input >0)
		{
		remainder = input % 10;	
		System.out.println(remainder);
		
		sum = sum+ (remainder*remainder*remainder);
		System.out.println(sum);
		
		input= input/10;
		System.out.println(input);
		
		}
		
		if(sum == original)
		{
			System.out.println("Given number is an Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}

	}

}
