package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class timeOut {
      public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
		//ҳ����س�ʱʱ������Ϊ5s
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get("http://www.baidu.com");
		
		//��λ�����10sʱ�䣬���10s�ڻ�δ��λ���������׳��쳣
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("kw33")).sendKeys();
		
		//�첽�ű� �ĳ�ʱʱ�����ó�3s
		driver.manage().timeouts().setScriptTimeout(3,TimeUnit.SECONDS);
		driver.quit();
		
	}
}
