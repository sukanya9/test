package org.sspart.gmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {

	WebDriver driver=null;
	@BeforeTest
	
	public void launchBrowser() {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	}
	
	@Test
	public void openGmail() throws InterruptedException {
	driver.get("https://gmail.com");
	System.out.println("Gmail login");
	driver.findElement(By.id("identifierId")).sendKeys("sukanya.pasupula9@gmail.com");
	driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
	Thread.sleep(1000);
	//driver.findElement(By.name("password")).sendKeys("Sukanya@9");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sukanya@9");
	System.out.println("Login with username and password");
	driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
	System.out.println("Opened gmail home");
	}
	
	
	
	@Test
	public void Compose() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
	Thread.sleep(1000);
	}
	@AfterTest
	
	public void quit() {
		driver.quit();
		
	}
}
