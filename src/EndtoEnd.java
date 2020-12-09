import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); Change to Round Trip
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		Thread.sleep(1000);
		//Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).isSelected());
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		//Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).isSelected());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='IXJ']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("One way trip");
			Assert.assertTrue(true);
		}
		else
		{
		Assert.assertFalse(false);
		System.out.println("Round trip");
		}
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")).click();
		Select s1=new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		s1.selectByValue("7");
		//driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"))
		Select s2=new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		s2.selectByValue("USD");
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		
	}

}
