package com.mypro.testng;

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

public class TestLogin {
  private WebDriver driver;
  private String baseUrl;
  
  @BeforeMethod
  public void setUp() throws Exception{
	 
	  System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
	  driver =new ChromeDriver();
	  baseUrl="http://www.zhitouwang.cn/login/login.html";
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
  }
  //�����������
  @DataProvider(name="user")
  public Object[][] Users(){
	  return new Object[][]{
		  {"","","�û��������벻��Ϊ��!"},
		  {"","111111","�û�������Ϊ��!"},
		  {"15201461448","","���벻��Ϊ��!"},
		  {"1520146144","111111","�û������������"}
     };
}
 
  
  @Test(dataProvider="user")
  public void testCase(String username,String password,String exceptText) throws Exception{
	  driver.get(baseUrl);
	  //���õ�¼ģ��
	  Thread.sleep(1000);
	  Login.login(driver, username, password);
	  Thread.sleep(1000);
	
	//create a alert instance
	  Alert alert1=driver.switchTo().alert();
	  //print alert text
	  System.out.println(alert1.getText());
	  String text = alert1.getText();
	  //��alert���򲶻���
	   alert1.accept();
	  System.out.println("text:"+text);
	  System.out.println("exceptText:"+exceptText);
	 // Assert.assertEquals(text,exceptText);
	  //�����˳�ģ��
	  Login.logout(driver);
	 }
  
   @AfterMethod
  public void tearDown() throws Exception{
	  driver.quit();
  }
  
}
