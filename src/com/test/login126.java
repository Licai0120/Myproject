package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login126 {
	public static void main(String[] args) {
		System.out.println("126 mail login.");
		System.setProperty("webdriver.chrome.driver","G:/ѧϰ/selenium/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http:/www.126.com");
		driver.findElement(By.id("idTnput")).clear();
		driver.findElement(By.id("idTnput")).sendKeys("username");
		driver.findElement(By.id("pwdTnput")).clear();
		driver.findElement(By.id("pwdTnput")).sendKeys("password");
		driver.findElement(By.id("loginBtn")).click();
		
		driver.quit();
		
		
	}

}
