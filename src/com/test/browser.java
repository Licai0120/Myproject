package com.test;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/ѧϰ/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(480,800));
		driver.get("http://www.baidu.com");
		driver.quit();
	}

}
