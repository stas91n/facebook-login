import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23252/eng-vs-pak-2nd-t20i-pakistan-tour-of-england-2020");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	int rowcoint=	table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
			
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<count-2;i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		}
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		
		
		
		
		
		
		
		
		
	}

}
