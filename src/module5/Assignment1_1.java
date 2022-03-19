package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/r.php");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ananya");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sarkar");
			Select sel_month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
			sel_month.selectByIndex(2);
			By pwdtxtbox = RelativeLocator.with(By.tagName("input")).above(By.id("month"));
			driver.findElement(pwdtxtbox).sendKeys("abcd123");
			Thread.sleep(3000);
			Select sel_day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
			sel_day.selectByVisibleText("6");
			Select sel_year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
			sel_year.selectByVisibleText("1996");
			Thread.sleep(4000);
			By maleradiobttn = RelativeLocator.with(By.tagName("input")).below(By.id("day"));
			Thread.sleep(2000);
			By femaleradiobttn = RelativeLocator.with(By.tagName("input")).toLeftOf(maleradiobttn);
			driver.findElement(femaleradiobttn).click();
			
			Thread.sleep(4000);
			
			driver.close();

	}

}
