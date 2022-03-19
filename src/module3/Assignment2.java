package module3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(4000);
		ArrayList <String> tabs = new ArrayList <String>(driver.getWindowHandles());
		System.out.println(tabs);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(4000);
		String txt1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(txt1);
		Thread.sleep(4000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(4000);
		WebElement plaintxt = driver.findElement(By.className("main-header"));
		System.out.println(plaintxt.getText());
		Thread.sleep(4000);
		driver.quit();


	}

}
