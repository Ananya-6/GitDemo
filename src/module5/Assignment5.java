package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver2.manage().window().maximize();
		Thread.sleep(6000);
		//switching to frames
		driver2.switchTo().frame(1);
		Thread.sleep(5000);
		driver2.findElement(By.xpath("//button[(text()='Try it')]")).click();
		Thread.sleep(5000);
		driver2.switchTo().alert().sendKeys("Ananya");
		Thread.sleep(4000);
		driver2.switchTo().alert().accept();
		Thread.sleep(3000);
		String x = driver2.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(x);

		
		
		
		
		
	}

}
