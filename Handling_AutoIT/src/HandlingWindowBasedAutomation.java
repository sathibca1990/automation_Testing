import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowBasedAutomation {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Util//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='wdgt-file-upload']")).click();
		
		Runtime.getRuntime().exec("D:\\Sathish\\AutoIT\\Uploadfile.exe");
		
	}
}

