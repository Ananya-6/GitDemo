package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		Thread.sleep(3000);
		driver2.manage().window().maximize();
		driver2.switchTo().frame(0);
	    String x = driver2.findElement(By.xpath("//p[contains(text(),'my')]")).getText();
	    System.out.println(x);
		driver2.switchTo().defaultContent();
		Thread.sleep(3000);
		driver2.switchTo().frame(1);
		Thread.sleep(3000);
		WebElement browser = driver2.findElement(By.xpath("//tbody/tr[2]/td[2]/textarea[1]"));
		browser.clear();
		Thread.sleep(3000);
		browser.sendKeys("Hello this is me ananya. nice to meet you all");
		Thread.sleep(7000);
		System.out.println(browser.getAttribute("value"));
		Thread.sleep(3000);
		driver2.switchTo().defaultContent();
		Thread.sleep(3000);
		driver2.switchTo().frame(2);
		WebElement x2 = driver2.findElement(By.xpath("//tbody/tr[1]/td[2]/p[2]/font[1]"));
		System.out.println(x2.getText());
		driver2.close();

	}

}
