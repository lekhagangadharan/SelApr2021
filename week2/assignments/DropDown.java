package week2.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
	
		//Set up
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		//Locate the parent element with the slect tag
		WebElement loadRunner1 = driver.findElementById("dropdown1");
		
		//Create an object for the Select Class and pass the element
		Select dropDown = new Select(loadRunner1);
		
		//to find the last index
		List<WebElement> options = dropDown.getOptions();
		int size = options.size();
		
		int lastIndex = size-1;
		int secondLastIndex = size-2;
		
		dropDown.selectByIndex(secondLastIndex);
	}

}
