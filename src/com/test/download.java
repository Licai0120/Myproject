package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class download {
  public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "G:/ѧϰ/selenium.chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	FirefoxProfile firefoxProfile=new FirefoxProfile();
	firefoxProfile.setPreference("browse.download.folderList", 2);
	firefoxProfile.setPreference("borwser.download.manager.showWhenStarting",false);
	firefoxProfile.setPreference("browser.download.dir", "g:\\java");
	firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream");
	
	System.setProperty("webdriver.firefox.bin", "D:/Ӧ�ð�װ�ļ�/firefox setup 36.0.exe");
    WebDriver driver=new FirefoxDriver(firefoxProfile);
    driver.get("https://pypi.Python.org/pypi/selenium");
    driver.findElement(By.partialLinkText("selenium-2")).click();
}
}
