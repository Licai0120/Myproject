package com.mypro.testng.pub;


import org.openqa.selenium.*;

public class Login {
	
	//µÇÂ¼·½·¨
	public static void login(WebDriver driver ,String username,String password){
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys(username);
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys(password);
		driver.findElement(By.className("login-btn")).click();
		
	}
	
	public static void logout(WebDriver driver){
		driver.findElement(By.id("registerButton")).click();
	}

}
