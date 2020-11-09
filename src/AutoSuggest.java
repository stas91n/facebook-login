
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //enter url
		driver.findElement(By.id("autosuggest")).sendKeys("ind"); // go to element and wright ind 
		Thread.sleep(3000);
		// now set up a loop witch will look for the keyword you want
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); // right click item on list to get 
				//class name for this step
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
					{
				option.click();
				break;
					}
					
					
		}
		
		
		
		
		
		
		
		
	}

}
