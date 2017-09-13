package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {
     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:/学习/selenium/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.baidu.com");
		//获取当前句柄(对象标识)
		String search_handle=driver.getWindowHandle();
		System.out.println(search_handle);
		driver.findElement(By.linkText("登录")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("立即注册")).click();
		
		//获得所有窗口句柄
		Set<String> handles=driver.getWindowHandles();
		//判断是否为注册页面，并操作注册页面元素
		for(String handle:handles){
			if(handle.equals(search_handle)==false){
				driver.switchTo().window(handle);
				System.out.println("now register window！");
				Thread.sleep(3000);
				driver.findElement(By.name("account")).clear();
				driver.findElement(By.name("account")).sendKeys("15201461448");
				driver.findElement(By.name("password")).sendKeys("lc19920120");
				Thread.sleep(2000);
				//关闭当前窗口
				driver.close();
				
			}
			
		}
		//判断是否为百度首页，并操作页面上的元素
		for(String handle:handles){
			if(handle.equals(search_handle)){
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				driver.findElement(By.className("close-btn")).click();
				System.out.println("now baidu page!");
				driver.findElement(By.id("kw")).sendKeys("webdriver");
				driver.findElement(By.id("su")).click();
				Thread.sleep(2000);
				
			}
		}
		driver.quit();
		}
}
