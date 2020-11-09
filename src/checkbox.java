import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();//click
		//now lets test if the checkbox is selected
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		//print number of checkboxes on page
		
		//in ChroPath serch for boxes --> input[type='checkbox']
		//driver.findElements(By.cssSelector("input[type='checkbox']")).size(); --> nmber of elements
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
