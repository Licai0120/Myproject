package com.mypro.testng;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test; 
import com.mypro.testng.pub.*;
@Test 
public class RegistrationActivity{
  private WebDriver driver;
  private String baseUrl;
  
 //��ʼ��
 @BeforeMethod
 public void setUp() throws Exception{
	 
	  System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
	  driver =new ChromeDriver();
	  baseUrl="http://www.zhitouwang.cn/login/login.html";
	  driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS );
  }

  
  @Test
  public void testCase() throws Exception{
	  driver.get(baseUrl);
	  String username="15201461448";
	  String password="111111";
	  WebDriver newWindow=null;
	  //���õ�¼ģ��
	  Thread.sleep(1000);
	  Login.login(driver, username, password);
	  Thread.sleep(3000);
	  //��ת�ҳ
	  driver.findElement(By.id("act-index")).click();
	  Thread.sleep(500);
	  //���ػ����ҳ
	  driver.findElement(By.xpath("/html/body/section/div[1]/div/a[1]")).click();
	  //��ȡ��ǰ���ھ��
	  newWindow = GetCurrentHandle.getCurrentHandle(driver,newWindow);
	  //�����������
      newWindow.findElement(By.className("act-red-btn")).click();
      newWindow.findElement(By.id("remarkIn")).clear();
      newWindow.findElement(By.id("remarkIn")).sendKeys("��");
      //�����ɰ�ť
      newWindow.findElement(By.className("complete_btn")).click();
      Thread.sleep(1000);
      //����ύ������ȷ������ť
      newWindow.findElement(By.className("rDialog-ok")).click();
      Thread.sleep(2000);
   
	 }
  @AfterMethod
  public void tearDown() throws Exception{
	  driver.quit();
  }

  
  
}
