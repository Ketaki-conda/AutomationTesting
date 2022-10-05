
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.findElement(By.id("username")).sendKeys("ketakidhotre272001");
		driver.findElement(By.id("password")).sendKeys("ketakidhotre272001");
		driver.findElement(By.id("login")).click();


	}

}
