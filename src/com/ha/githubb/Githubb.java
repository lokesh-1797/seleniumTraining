package com.ha.githubb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Githubb {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://github.com/");
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		driver.findElement(By.id("login_field")).sendKeys("Admin");
		
		driver.findElement(By.name("commit")).click();
		
		driver.quit();
		
		
		
		

	}

}
