package com.ha.gotomeeting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GotoMeeting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.goto.com/meeting/");
		
		driver.findElement(By.id("truste-consent-button")).click(); 
		
		driver.findElement(By.partialLinkText("Try Free")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("John");
		
		driver.findElement(By.id("last-name")).sendKeys("Wick");
		
		driver.findElement(By.id("login__email")).sendKeys("john@gmail.com");
		
		Select sel=new Select(driver.findElement(By.name("CompanySize")));
		sel.selectByVisibleText("10 - 99");
		
		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();
		
		

	}

}
