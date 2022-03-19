package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.google.com/");
		System.out.println(driver2.getTitle());
		Thread.sleep(5000);
		driver2.quit();

	}

}
