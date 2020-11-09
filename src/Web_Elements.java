import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Web_Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		driver.findElement(By.id("divpaxinfo")).click();
		//Thread.sleep(2000L);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(4000);
		 
			int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			System.out.println();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
