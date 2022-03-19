package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Slider = driver.findElement(By.xpath("//*[@id='slider']"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(Slider, 50, 0).build().perform();
		Thread.sleep(5000);
		driver.close();

	}

}
