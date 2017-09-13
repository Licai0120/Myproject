package com.mypro.testng.pub;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;



public class GetCurrentHandle {
	public static WebDriver getCurrentHandle(WebDriver driver,WebDriver newWindow){
		
	      String current_handle=driver.getWindowHandle();
		  Set<String> all_handles = driver.getWindowHandles();
		  //循环判断，把当前句柄从所有句柄中移除，剩下的就是你想要的新窗口
		  Iterator<String> it = all_handles.iterator();
		  String handle = null;
		  while(it.hasNext()){
			  handle = it.next();
			  if(current_handle==handle){
				  continue;
			  }
			  //跳入新窗口,并获得新窗口的driver - newWindow
			  System.out.println("跳入新窗口,并获得新窗口的driver");
			  newWindow  = driver.switchTo().window(handle);
			 // System.out.println("newWindow"+newWindow);
		  }
		  return newWindow;
	}


}
