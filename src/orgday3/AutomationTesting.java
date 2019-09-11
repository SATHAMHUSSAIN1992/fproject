package orgday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Day 3\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement source =driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement acc =driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(source, acc).perform();
		
		WebElement cr =driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement side =driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
		ac.dragAndDrop(cr,side).perform();
		
		WebElement a =driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement b =driver.findElement(By.xpath("//ol[@id='loan']"));
		ac.dragAndDrop(a,b).perform();
		
		WebElement c =driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement d =driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
		ac.dragAndDrop(c,d).perform();
	}

}
