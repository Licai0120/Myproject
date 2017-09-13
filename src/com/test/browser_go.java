package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_go {
   public static void main(String[] args) throws Exception {
	 System.out.println("browser back and forword.");
	 System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 
	 String firstUrl="http://www.baidu.com";
	 System.out.printf("%s\n",firstUrl);
	 driver.get(firstUrl);
	 
	 String secondUrl="http://news.baidu.com";
	 System.out.printf("%s\n",secondUrl);
	 driver.get(secondUrl);
	 
	 System.out.printf("now back to %s\n", firstUrl);
	 driver.navigate().back();
	 Thread.sleep(500);
	 
	 System.out.printf("forward to %s\n", secondUrl);
	 driver.navigate().forward();
	 Thread.sleep(500);
	 
	 driver.quit();
   }
}
