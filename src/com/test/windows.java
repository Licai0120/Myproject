package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {
     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.baidu.com");
		//��ȡ��ǰ���(�����ʶ)
		String search_handle=driver.getWindowHandle();
		System.out.println(search_handle);
		driver.findElement(By.linkText("��¼")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("����ע��")).click();
		
		//������д��ھ��
		Set<String> handles=driver.getWindowHandles();
		//�ж��Ƿ�Ϊע��ҳ�棬������ע��ҳ��Ԫ��
		for(String handle:handles){
			if(handle.equals(search_handle)==false){
				driver.switchTo().window(handle);
				System.out.println("now register window��");
				Thread.sleep(3000);
				driver.findElement(By.name("account")).clear();
				driver.findElement(By.name("account")).sendKeys("15201461448");
				driver.findElement(By.name("password")).sendKeys("lc19920120");
				Thread.sleep(2000);
				//�رյ�ǰ����
				driver.close();
				
			}
			
		}
		//�ж��Ƿ�Ϊ�ٶ���ҳ��������ҳ���ϵ�Ԫ��
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
