package com.bd.LoginAutomation;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.By;

public class Facebook extends DriverSetup {
  
	
	public static String baseUrl="https://www.facebook.com/";
	
	@Test
	public static void evaly() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("grownonfacinggodet");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		Thread.sleep(10000);
		

		
		
		
		
	}
	
	
}
