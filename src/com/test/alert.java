package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class alert {
  public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://www.baidu.com");
	 
	 //�����ͣ��"����"����
	 Actions action=new Actions(driver);
	 action.clickAndHold(driver.findElement(By.linkText("����"))).perform();
	 
	 //����������
	 driver.findElement(By.className("setpref")).click();
	 //��������,m
	 driver.findElement(By.xpath("//div[@id='gxszButton']/a")).click();
	//driver.findElement(By.linkText("��������")).click();
	 //���յ���
	 driver.switchTo().alert().accept();
	 driver.quit();
}
}
