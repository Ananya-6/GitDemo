package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//div[@id='email_container']//child::*
		//div[@id='email_container']//following-sibling::*[1]
		//div[@id='email_container']//following-sibling::*[2]
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
