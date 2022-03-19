package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Ananya");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Sarkar");
		Select sel_month = new Select(driver.findElement(By.id("month")));
		sel_month.selectByIndex(2);
		Select sel_day = new Select(driver.findElement(By.id("day")));
		sel_day.selectByVisibleText("6");
		Select sel_year = new Select(driver.findElement(By.id("year")));
		sel_year.selectByVisibleText("1996");
		driver.findElement(By.name("sex")).click();
		Thread.sleep(4000);

	}

}
