package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		driver2.manage().window().maximize();
		Thread.sleep(3000);
		driver2.findElement(By.xpath(" //button[contains(text(),'Click here to show confirm alert')]")).click();
		//printing the web alert
		String x = driver2.switchTo().alert().getText();
		System.out.println(x);
		if(x.contains("Are you sure you want to close this account permanently?")){
			System.out.println("Test passed");
		}
		else{
			System.out.println("Test failed");
		}
		Thread.sleep(3000);
		driver2.switchTo().alert().accept();
		Thread.sleep(3000);
		String x1 = driver2.switchTo().alert().getText();
		Thread.sleep(5000);
		System.out.println(x1);
		driver2.quit();
	
	
	}

}
