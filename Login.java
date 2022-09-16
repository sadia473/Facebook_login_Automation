package com.bd.LoginAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends DriverSetup {

	public static String baseUrl="https://evaly.com.bd/";
	
	@Test
	public static void evaly() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class=\"absolute top-0 right-0 p-2 text-white\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='all-shops']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[contains(text(),'Evaly Hero Official Store')]")).click();
		Thread.sleep(4000);
		
	}
	
	
}
