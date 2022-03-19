package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Ananya");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Ananya");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("value"));
		Thread.sleep(2000);
		driver.close();

	}

}
