package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js {
  public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.baidu.com");
	driver.findElement(By.id("kw")).sendKeys("webdriver api");
	driver.findElement(By.id("su")).click();
	 Thread.sleep(3000);
	//ҳ������ϵ��ײ�
	((JavascriptExecutor)driver).executeScript("window.scrollTo(100,950);");
	 Thread.sleep(3000);
	//ҳ������ϵ�����
	//((JavascriptExecutor)driver).executeScript("document.documentElement.scrollTop=0");
	 //Thread.sleep(3000);
	 System.out.println("end");
	 driver.quit();
}
}
