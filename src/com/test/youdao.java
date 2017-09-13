package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youdao {
   public static void main(String[] args) throws Exception {
	   System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.youdao.com");
	driver.findElement(By.name("q")).sendKeys("submit");
	Thread.sleep(500);
	driver.findElement(By.name("q")).submit();
	driver.quit();
}
}
