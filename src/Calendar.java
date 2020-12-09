import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		//driver.findElement(By.id("Div1")).getAttribute("Style").contains("");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
		{
		System.out.println("its enabled");
		Assert.assertTrue(true);	
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
