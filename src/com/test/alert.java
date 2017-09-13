package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class alert {
  public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "G:/学习/selenium/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://www.baidu.com");
	 
	 //鼠标悬停相"设置"链接
	 Actions action=new Actions(driver);
	 action.clickAndHold(driver.findElement(By.linkText("设置"))).perform();
	 
	 //打开搜索设置
	 driver.findElement(By.className("setpref")).click();
	 //保存设置,m
	 driver.findElement(By.xpath("//div[@id='gxszButton']/a")).click();
	//driver.findElement(By.linkText("保存设置")).click();
	 //接收弹窗
	 driver.switchTo().alert().accept();
	 driver.quit();
}
}
