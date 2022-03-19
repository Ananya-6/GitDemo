package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com/");
		System.out.println(driver1.getTitle());
		Thread.sleep(5000);
		driver1.quit();

	}

}
