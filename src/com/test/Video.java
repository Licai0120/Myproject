package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video {
      public static void main(String[] args) throws InterruptedException{
    	 System.setProperty("webdriver.chrome.driver", "G:/学习/selenium/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		driver.get("http://videojs.com/");
		WebElement video=driver.findElement(By.id("preview-player"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//获取视屏的url
		jse.executeScript("return arguments[0].currentSrc",video );
		//播放视屏，播放15秒
		jse.executeScript("return arguments[0].play()", video);
		Thread.sleep(55000);
		jse.executeScript("arguments[0].pause()",video);
		Thread.sleep(2500);
		driver.quit();
		
		
	}
}
