package week1.day1;

public class LearnDataTypes {

	//declaring the global variables
	String mobModel = "Motorola";
	int mobWeightInGrams = 143;
	boolean isFullyCharged = false;
	double mobCost = 15000.46;
	
	public static void main(String[] args) {
		
		//creating objects t access the variables
		LearnDataTypes mobInfo = new LearnDataTypes();
		System.out.println(mobInfo.mobModel);
		System.out.println(mobInfo.mobWeightInGrams);
		System.out.println(mobInfo.isFullyCharged);
		System.out.println(mobInfo.mobCost);

	}

}
