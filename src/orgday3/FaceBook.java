package orgday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Day 3\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("satham4all@gmail.com");
		
		
		
		
		
		
		
		
		
//		WebElement name =driver.findElement(By.xpath("//input[@id='pass']"));
	//	name.sendKeys("9791734485");
		
		//WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		//login.click();
}
}
