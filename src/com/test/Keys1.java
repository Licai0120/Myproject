package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys1 {


	public static void main(String[] args) {
		System.setProperty("webdirver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.baidu.com");
		
		WebElement input=driver.findElement(By.id("kw"));
		
		//�������������
		input.sendKeys("seleniumm");
		
		//ɾ���������m
		input.sendKeys(Keys.BACK_SPACE);
	}

}
