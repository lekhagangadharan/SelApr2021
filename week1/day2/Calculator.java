package week1.day2;

public class Calculator {

	public int add(int a, int b) {
		int sum;
		sum = a+b;
		return sum;
	}
	
	public double sub(double c, double d) {
		double sub;
		sub = c-d;
		return sub;

	}
	
	public double multiply(double x, double y)
	{
		double mul;
		mul= x*y;
		return mul;
	}
	
	public int divide(int m, int n)
	{
		int div;
		div= m/n;
		return div;
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int totalSum = calc.add(10, 20);
		System.out.println(totalSum);
		
		double totalSub = calc.sub(10000.55, 10000.22);
		System.out.println(totalSub);
		
		double totalMul = calc.multiply(1000.10, 1000.20);
		System.out.println(totalMul);
		
		int totalDiv = calc.divide(100000, 1000);
		System.out.println(totalDiv);

	}

}
