package com.test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookie {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium/chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.get("http://www.youdao.com");
    
    Cookie c1=new Cookie("name","key-aaaaaaa");
    Cookie c2=new Cookie("value","value-bbbbbb");
    
    driver.manage().addCookie(c1);
    driver.manage().addCookie(c2);
    
    //ɾ������cookie
    driver.manage().deleteAllCookies();
    //��ȡcookie
    Set<Cookie> coo=driver.manage().getCookies();
    System.out.println(coo);
    driver.quit();
   }
}
