package module4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='sView1:r1:0:email::content']")).sendKeys("ananyacse175@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='sView1:r1:0:password::content']")).sendKeys("abcdefg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sView1:r1:0:retypePassword::content']")).sendKeys("abcdefg");
		Thread.sleep(2000);
		Select sel_country = new Select(driver.findElement(By.xpath("//select[@id='sView1:r1:0:country::content']")));
		Thread.sleep(2000);
		sel_country.selectByVisibleText("Canada");
		Select sel_city = new Select(driver.findElement(By.xpath("//select[@id='sView1:r1:0:state::content']")));
		sel_city.selectByVisibleText("Ontario");
		Thread.sleep(4000);
		driver.close();

	}

}
