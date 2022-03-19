package module4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    Thread.sleep(7000);
	     List<WebElement> links = driver.findElements(By.tagName("a"));
	     int i = links.size();
	     System.out.println("Number of links available is : "+" "+i);
	     for(int j=1;j<=i;j++){
	    	 System.out.println("Number "+j+" link is "+links.get(j).getText());
	     }
	     Thread.sleep(12000);
	     driver.close();

	}

}
