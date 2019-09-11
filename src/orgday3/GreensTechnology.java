package orgday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Day 3\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement contact = driver.findElement(By.xpath("//a[@href='contact.php']"));
		contact.click();
		
		WebElement name =driver.findElement(By.id("InputName"));
		name.sendKeys("satham hussain");
		
		WebElement email = driver.findElement(By.id("InputEmail1"));
		email.sendKeys("satham4all@gmail.com");
		
		WebElement phno = driver.findElement(By.id("InputSubject"));
		phno.sendKeys("9791734485");
		
		WebElement course = driver.findElement(By.name("courses"));
		course.sendKeys("Selenium");
		
		WebElement branch = driver.findElement(By.name("branch"));
		branch.sendKeys("omr");
		
		WebElement start = driver.findElement(By.name("time"));
		start.sendKeys("immediate");
		
		WebElement message = driver.findElement(By.name("comments"));
		message.sendKeys("course details");
		
		
	}
}
