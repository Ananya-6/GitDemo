package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
