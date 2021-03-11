package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CV_Upload {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/AutoIT/Upload.html");
		Thread.sleep(10000);
		/*driver.findElement(By.xpath("//span[text()='Add file']")).click();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='picker-frame']")));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(text(),'device')]")).click();
		Thread.sleep(10000);*/
		driver.findElement(By.id("input")).click();
		Thread.sleep(10000);
		Runtime.getRuntime().exec("E:\\AutoIT\\upload.exe");
		
		
		
	}
}
