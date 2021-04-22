package week1.day1;

public class Mobile {

	public void makeCall() {
		
		System.out.println("Call is made");

	}
	
	public void sendMsg() {
		
		System.out.println("Message has been sent");

	}
	
	public static void main(String[] args) {
		
		//creating object to access the methods
		Mobile mobActions = new Mobile();
		mobActions.makeCall();
		mobActions.sendMsg();
	}
}
