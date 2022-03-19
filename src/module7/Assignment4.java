package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//body[1]/div[1]/main[1]/div[4]/div[1]/div[1]
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String plaintxt = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[4]/div[1]/div[1]")).getText();
		Thread.sleep(4000);
		System.out.println(plaintxt);
		Thread.sleep(4000);
		driver.close();

	}

}
