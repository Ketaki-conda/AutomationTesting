package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://adactinhotelapp.com");
		driver.findElement(By.id("username")).sendKeys("cinchanas");
		driver.findElement(By.id("password")).sendKeys("adactin");
		driver.findElement(By.id("login")).click();
		
		String actualTitle= driver.getTitle();
		if(actualTitle.equalsIgnoreCase("Adactin.com - Search Hotel")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
	}

}













