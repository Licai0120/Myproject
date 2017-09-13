package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class timeOut {
      public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:/学习/selenium/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
		//页面加载超时时间设置为5s
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get("http://www.baidu.com");
		
		//定位对象给10s时间，如果10s内还未定位到对象则抛出异常
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("kw33")).sendKeys();
		
		//异步脚本 的超时时间设置成3s
		driver.manage().timeouts().setScriptTimeout(3,TimeUnit.SECONDS);
		driver.quit();
		
	}
}
