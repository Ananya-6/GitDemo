package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='email_container']//child::*")).sendKeys("01980436737");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='email_container']//following-sibling::*[2]")).click();
		Thread.sleep(6000);
		driver.close();

	}

}
