package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.baidu.com");
		
		//��ȡ�ٶ������ߴ�
		WebElement size=driver.findElement(By.id("kw"));
		System.out.println(size.getSize());
		
		//����Ԫ�ص�����ֵ
		WebElement ty=driver.findElement(By.id("kw"));
		System.out.println(ty.getAttribute("name"));
		
		//����Ԫ�صĽ���Ƿ�ɼ�
		WebElement display=driver.findElement(By.id("kw"));
		System.out.println(display.isDisplayed());
		driver.quit();

	}

}
