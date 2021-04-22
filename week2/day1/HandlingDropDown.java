package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
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
		
		//Locate the parent element(with select tag)
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		
		//create an object for the select class and pass the parent elemet as argument
		Select dropDown = new Select(source);
		
		//select by Visible Text
		//dropDown.selectByVisibleText("Conference");
		
		//select by value
		dropDown.selectByValue("LEAD_CONFERENCE");
		
		Thread.sleep(3000);
		
		//select by index (Index number starts from 0)
	    dropDown.selectByIndex(1);
	    
	    List<WebElement> options = dropDown.getOptions();
	    
	    //To get number of items in the list
	    int size = options.size();
	    
	    //to identify the index for the last item
	    int lastIndex = size-1;
	    
	    //select by index
	    dropDown.selectByIndex(lastIndex);

	}

}
