package com.test;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upfile {
   public static void main(String[] args)  throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	File file=new File("G:/upfile.html");
	String filePath=file.getAbsolutePath();
	driver.get(filePath);
	
	//��λ�ϴ���ť����ӱ����ļ�
	driver.findElement(By.name("file")).sendKeys("G:\\upfile.txt");
	Thread.sleep(4000);
	driver.quit();
	
}
}
