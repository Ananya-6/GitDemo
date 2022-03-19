package week_assignment12_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_facebook_Reg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Ananya");
		driver.findElement(By.name("lastname")).sendKeys("Sarkar");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("4379224210");
		driver.findElement(By.xpath("//input[@type='password')]")).sendKeys("ABCDefg");
		

	}

}
