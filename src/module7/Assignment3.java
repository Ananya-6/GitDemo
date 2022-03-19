package module7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//a[contains(text(),'All downloads')]
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://launchpad.net/sikuli");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'All downloads')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[contains(text(),'sikulixsetup-1.1.2.jar')]")).click();
		Thread.sleep(4000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		r.delay(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.delay(3000);
		Thread.sleep(4000);
		driver.close();

	}

}
