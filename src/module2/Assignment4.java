package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver.exe");
		WebDriver driver3 = new EdgeDriver();
		driver3.get("https://www.google.com/");
		System.out.println(driver3.getTitle());
		Thread.sleep(5000);
		driver3.quit();

	}

}
