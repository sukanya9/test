package org.sspart.gmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Launch browser
		WebDriver driver=new ChromeDriver();
		//Open url
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("sukanya.pasupula9@gmail.com");
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		//driver.findElement(By.name("password")).sendKeys("Sukanya@9");
		System.out.println("Gmail home page");
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		driver.quit();
		
	}

}
