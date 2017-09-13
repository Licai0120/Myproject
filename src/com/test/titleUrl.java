package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:/Ñ§Ï°/selenium/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.126.com");
		System.out.println("Before login======");
		System.out.printf("title of curent page is %s\n",driver.getTitle());
		System.out.printf("Url curent page is %s\n",driver.getCurrentUrl());
		
		//µÇÂ½126
		driver.findElement(By.id("auto-id-1501137366623")).clear();
		driver.findElement(By.id("auto-id-1501137366623")).sendKeys("testinglccc");
		driver.findElement(By.id("auto-id-1501137366626")).clear();
		driver.findElement(By.id("auto-id-1501137366626")).sendKeys("lc111111");
		driver.findElement(By.id("dologin")).click();
		
		System.out.println("After login =========");
		System.out.printf("title of current page is %s\n",driver.getTitle());
		System.out.printf("url of current page is %s\n",driver.getCurrentUrl());
		
		driver.quit();

	}

}
