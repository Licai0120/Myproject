package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys1 {


	public static void main(String[] args) {
		System.setProperty("webdirver.chrome.driver", "G:/学习/selenium/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.baidu.com");
		
		WebElement input=driver.findElement(By.id("kw"));
		
		//输入框输入内容
		input.sendKeys("seleniumm");
		
		//删除多输入的m
		input.sendKeys(Keys.BACK_SPACE);
	}

}
