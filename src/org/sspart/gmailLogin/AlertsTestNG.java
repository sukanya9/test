package org.sspart.gmailLogin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertsTestNG {
	WebDriver driver=null;
	
	@BeforeTest
	public void browser(){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver(); 
			driver.manage().window().maximize();
			System.out.println("Maximize window");
	}
	@Test
	public void openUrl() throws InterruptedException {
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			System.out.println(driver.getTitle());
			driver.findElement(By.name("cusid")).sendKeys("213");
			driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
			System.out.println("submited");
			Alert a=driver.switchTo().alert();
			System.out.println("Display Alert text");
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			String alertMsg=driver.switchTo().alert().getText();
			System.out.println(alertMsg);
			Thread.sleep(1000);
			a.dismiss();
				
			driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}System.out.println(alertMsg);
			//a.getText();
			//System.out.println("dispaly alert text");
			Thread.sleep(1000);
			a.accept();
			System.out.println("Accepting Alert");
			System.out.println(alertMsg);
			Thread.sleep(4000);
	}
	
	@AfterTest
	public void quit() {
		
			driver.quit();
			System.out.println("Close the browser");
			
		}

}
