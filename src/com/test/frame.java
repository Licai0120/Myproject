package com.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
 public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "G:/Ñ§Ï°/selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	File file=new File("G:/frame.html");
	String filepath=file.getAbsolutePath();
	driver.get(filepath);
	
	//ÇÐ»»iframe
	driver.switchTo().frame("if");
	driver.findElement(By.id("kw")).sendKeys("webdriver");
	driver.findElement(By.id("su")).click();
	
	Thread.sleep(5000);
    driver.quit();
	
 }
}
