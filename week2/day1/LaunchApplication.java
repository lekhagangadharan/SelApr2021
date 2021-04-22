package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		//Step1 - To set up the driver
		WebDriverManager.chromedriver().setup();
		
		//Step 2- Open Chrome Browser- Create Object for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Step 3- Load the application URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Step 4- Maximize the application
		driver.manage().window().maximize();
		
		//Step 5- Enter the User Name Text Field
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("Demosalesmanager");
		
		//Step 6 - ENter the password
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");
		
		//Step 7- Clicl on login 
		WebElement login = driver.findElementByClassName("decorativeSubmit");
		login.click();
		
		//Step 8- locate a link using Link Text Locator
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Step 9-Click on Leads
		driver.findElementByLinkText("Leads").click();
		
		//Step 10- Click on Create Leads link
		driver.findElementByLinkText("Create Lead").click();
		
		//enter the company name
		WebElement companyName = driver.findElementById("createLeadForm_companyName");
		companyName.sendKeys("TestLeaf");
		
		//Enter first name
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys("ABC");
		
		//Enter last name
		WebElement lastName = driver.findElementById("createLeadForm_lastName");
		lastName.sendKeys("DEF");
		
		//Click on Create Lead button
		driver.findElementByClassName("smallSubmit").click();
		
	}

}
