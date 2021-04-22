package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		//Enter the email id
		WebElement emailId = driver.findElementById("email");
		emailId.sendKeys("kumar.testleaf@gmail.com");
		
		//Enter the password
		WebElement password = driver.findElementById("password");
		password.sendKeys("leaf@12");
		
		//Click on Login Button
		driver.findElementByClassName("btn").click();
		
		//get title of the page
		driver.getTitle();
		System.out.println("Title of the page is- " + driver.getTitle());
		
		if(driver.getTitle().contains("ACME"))
		{
			System.out.println("I confirm the title has ACME");
		}
		else
		{
			System.out.println("The title doesnot have ACME");
		}
		
        //Click on Log Out
		driver.findElementByLinkText("Log Out").click();
		
		//get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is- " + currentUrl);
		
		Thread.sleep(3000);
		
		//close the browser
		driver.close();

	}

}
