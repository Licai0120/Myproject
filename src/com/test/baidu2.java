package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:/学习/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.baidu.com");
		
		//获取百度输入框尺寸
		WebElement size=driver.findElement(By.id("kw"));
		System.out.println(size.getSize());
		
		//返回元素的属性值
		WebElement ty=driver.findElement(By.id("kw"));
		System.out.println(ty.getAttribute("name"));
		
		//返回元素的结果是否可见
		WebElement display=driver.findElement(By.id("kw"));
		System.out.println(display.isDisplayed());
		driver.quit();

	}

}
