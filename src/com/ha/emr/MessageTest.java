package com.ha.emr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MessageTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.openemr.io/b/openemr");
		
		//WebElement ele=driver.findElement(By.id("authUser"));
		//ele.sendKeys("admin");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		
		//WebElement ele2=driver.findElement(By.id("clearPass"));
		//ele2.sendKeys("pass");
		
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		
		Select sel=new Select(driver.findElement(By.name("languageChoice")));
		sel.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();

	}

}
