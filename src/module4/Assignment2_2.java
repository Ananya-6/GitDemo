package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select sel_country = new Select(driver.findElement(By.xpath("//select[@id='sView1:r1:0:country::content']")));
		Thread.sleep(2000);
		sel_country.selectByVisibleText("Canada");
		Thread.sleep(2000);
		Select sel_city = new Select(driver.findElement(By.xpath("//select[@id='sView1:r1:0:state::content']")));
		sel_city.selectByVisibleText("Ontario");
		Thread.sleep(4000);
		driver.close();

	}

}
