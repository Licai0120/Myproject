package com.test;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elements1  {
     public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		File file=new File("G:/checkbox.html");
		String filepath=file.getAbsolutePath();
		driver.get(filepath);
		
		//ͨ��xpath�ҵ�һ��Ԫ��
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement checkbox:checkboxes){
			checkbox.click();
		}
		Thread.sleep(3000);
		
		//ˢ��
		driver.navigate().refresh();
		//ҳ�����1��checkbox�Ĺ�ȥ��
		List <WebElement> allCheckboxes=driver.findElements(By.cssSelector("input[type=checkbox]"));
		System.out.println(allCheckboxes.size());
		allCheckboxes.get(allCheckboxes.size()-1).click();
		Thread.sleep(5000);
		  driver.quit();
	}
   
}
