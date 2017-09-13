package com.mypro.testng;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mypro.testng.pub.GetCurrentHandle;
import com.mypro.testng.pub.Login;


public class BuyVideo {
  private WebDriver driver;
  private String baseUrl;
  private WebElement element;
  
  @BeforeMethod
  public void setUp() throws Exception{
	 
	  System.setProperty("webdriver.chrome.driver", "G:/学习/selenium/chromedriver.exe");
	  driver =new ChromeDriver();
	  baseUrl="http://www.zhitouwang.cn/login/login.html";
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
  }

  
  @Test
  public void testCase() throws Exception{
	  driver.get(baseUrl);
	  String username="15201461448";
	  String password="111111";
	  WebDriver newWindow=null;
	  Thread.sleep(1000);
	  Login.login(driver, username, password);
	  Thread.sleep(1000);
	  //加载学堂页
	  driver.findElement(By.id("video-index")).click();
	  Thread.sleep(1000);
	  //加载视频详情页
	  driver.findElement(By.xpath("//a[@href='/study/video/100135.html']")).click();
	  
	  //获取当前窗口句柄
	  newWindow = GetCurrentHandle.getCurrentHandle(driver,newWindow);
	  Thread.sleep(1000); 
		
	  //点击立即购买  
      //元素延时处理
     new WebDriverWait(driver, 45).until(
		         ExpectedConditions.presenceOfElementLocated(By.linkText("立即购买"))
		    		 ); 
     newWindow.findElement( By.className("red-btn")).click();;
     Thread.sleep(5000);
     WebElement state= newWindow.findElement(By.id("state"));
     String value=state.getAttribute("value");
     System.out.println("value="+state.getAttribute("value"));
     //if(!("".equals(value)) && "0".equals(value)){
     if( "0".equals(value)){
	     newWindow.findElement(By.linkText("确定")).click();
     }
     //newWindow.findElement(By.linkText("去支付")).click();
     Thread.sleep(3000); 
     
     newWindow.getCurrentUrl();
	 String url=newWindow.getCurrentUrl();
	 System.out.println("当前链接："+url);
	  //加载个人中心
	 newWindow.findElement(By.xpath("//*[@id='loginButton']")).click();
	 //我的订单
	 newWindow.findElement(By.cssSelector("#homekey > li:nth-child(4) > em")).click();
	 //删除订单
	 newWindow.switchTo().frame("iFrame1");
	// newWindow.findElement(By.cssSelector("#myvideo-list > dd.type-1 > div.info-head > span.del_video > em")).click();
	 newWindow.findElement(By.xpath("//*[@id='myvideo-list']/dd[1]/div[1]/span[4]/em")).click();
	 //处理确定删除alert弹框
	 Alert alt = newWindow.switchTo().alert();
	 alt.accept();
	 Thread.sleep(2000);
     
  }
  
  @AfterMethod
  public void tearDown() throws Exception{
	  driver.quit();
  }
   
}
