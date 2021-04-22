package week1.day1;

public class FibanocciSeries {

	public static void main(String[] args) {
		
		int firstNum = 0;
		int secNum = 1;
		int sum;
		int range =8	;
		
		for(int i=1 ; i<= range ; i++)
		{
			sum = firstNum+ secNum;
			firstNum=secNum;
			secNum = sum;
			System.out.println(sum);
		}

	}

}
