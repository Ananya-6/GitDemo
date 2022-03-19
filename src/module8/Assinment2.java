package module8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class Assinment2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		//Using implicit Wait
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Got it']")).click();
		//Thread.sleep(4000); 
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		Thread.sleep(2000);
		StringSelection s = new StringSelection("D:\\SeleniumCertification\\Software\\practice.docx");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		 driver.findElement(By.xpath("//span[text()='Download']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		 driver.findElement(By.xpath("//span[text()= 'Save to device']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		 driver.close();
		 

	}

}
