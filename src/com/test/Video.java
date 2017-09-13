package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video {
      public static void main(String[] args) throws InterruptedException{
    	 System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		driver.get("http://videojs.com/");
		WebElement video=driver.findElement(By.id("preview-player"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//��ȡ������url
		jse.executeScript("return arguments[0].currentSrc",video );
		//��������������15��
		jse.executeScript("return arguments[0].play()", video);
		Thread.sleep(55000);
		jse.executeScript("arguments[0].pause()",video);
		Thread.sleep(2500);
		driver.quit();
		
		
	}
}
