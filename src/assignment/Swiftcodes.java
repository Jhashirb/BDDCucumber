package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import gherkin.formatter.Reporter;

public class Swiftcodes 
{
	public static WebDriver driver = null;

	public void launchsite() 
	{
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
    driver.get("https://www.theswiftcodes.com/malaysia/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void getbanknames() 
	{
    	// Get the table 
    	WebElement table = driver.findElement(By.xpath(".//*[@class='swift']")); 

    	// Get all the TR elements from the table 
    	List<WebElement> allRows = table.findElements(By.tagName("tr"));
    	 
    	System.out.println(allRows.size());
    	// And iterate over rows, getting the banks name and swift codes
		for(int i=1;i<=allRows.size();i++) 
		 {
			try
		    {
				List<WebElement> allColumnsInRow = allRows.get(i).findElements(By.tagName("td"));			  
				int columns_count = allColumnsInRow.size();
				String bankname = allColumnsInRow.get(1).getText();
				//System.out.println("Bank Name :" +bankname);
				String swiftcode = allColumnsInRow.get(4).getText();
				System.out.println("Bank Name: " +bankname+ " ; Swift Code: "+swiftcode);
				
		    }
		    catch(Exception e)
		    {

		    }
		 }
	
	}

}