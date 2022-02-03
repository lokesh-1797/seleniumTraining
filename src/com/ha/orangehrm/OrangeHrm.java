package com.ha.orangehrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.id("welcome")).click();
		
		//driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
		driver.findElement(By.linkText("Logout")).click(); 
		
		driver.quit();
		
		
	}

}
