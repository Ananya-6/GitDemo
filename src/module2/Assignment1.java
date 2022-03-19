package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://intellipaat.com/");
		Thread.sleep(3000);
		driver1.quit();
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://intellipaat.com/");
		Thread.sleep(3000);
		driver2.quit();
		
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver.exe");
		WebDriver driver3 = new EdgeDriver();
		driver3.get("https://intellipaat.com/");
		Thread.sleep(3000);
		driver3.quit();

	}

}
