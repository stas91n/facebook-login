import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("my email");
		driver.findElement(By.name("pass")).sendKeys("123456789");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
