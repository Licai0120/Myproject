package com.test;


import java.io.File;
import java.util.*;
import java.util.List;
import java.awt.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elements {
   public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	File file=new File("G:/checkbox.html");
	String filePath=file.getAbsolutePath();
	driver.get(filePath);
	
	List <WebElement> checkboxes=driver.findElements(By.tagName("input"));
	for(WebElement checkbox:checkboxes){
		String type=new String(checkbox.getAttribute("type"));
		if(type.equals("checkbox")){
			checkbox.click();
			Thread.sleep(2000);
		}
		
	}
	System.out.println(checkboxes);
	driver.quit();
	
   }
}
