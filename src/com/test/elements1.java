package com.test;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elements1  {
     public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:/学习/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		File file=new File("G:/checkbox.html");
		String filepath=file.getAbsolutePath();
		driver.get(filepath);
		
		//通过xpath找到一组元素
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement checkbox:checkboxes){
			checkbox.click();
		}
		Thread.sleep(3000);
		
		//刷新
		driver.navigate().refresh();
		//页面最后1个checkbox的勾去掉
		List <WebElement> allCheckboxes=driver.findElements(By.cssSelector("input[type=checkbox]"));
		System.out.println(allCheckboxes.size());
		allCheckboxes.get(allCheckboxes.size()-1).click();
		Thread.sleep(5000);
		  driver.quit();
	}
   
}
