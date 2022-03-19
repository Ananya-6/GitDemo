package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		Thread.sleep(5000);
		WebElement Fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Thread.sleep(7000);
		Actions a = new Actions(driver);
		a.moveToElement(Fashion).build().perform();
		Thread.sleep(7000);
		WebElement footwear = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(footwear).build().perform();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//a[contains(text(),'All')]")).click();
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
