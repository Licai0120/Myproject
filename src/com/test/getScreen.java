package com.test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getScreen {
       public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.baidu.com");
		try{
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("g:\\screenshot.png"));
		}catch(Exception e){
			e.printStackTrace();
			
		}
		driver.quit();
	}
}
