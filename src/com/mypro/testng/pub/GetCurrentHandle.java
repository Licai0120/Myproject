package com.mypro.testng.pub;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;



public class GetCurrentHandle {
	public static WebDriver getCurrentHandle(WebDriver driver,WebDriver newWindow){
		
	      String current_handle=driver.getWindowHandle();
		  Set<String> all_handles = driver.getWindowHandles();
		  //ѭ���жϣ��ѵ�ǰ��������о�����Ƴ���ʣ�µľ�������Ҫ���´���
		  Iterator<String> it = all_handles.iterator();
		  String handle = null;
		  while(it.hasNext()){
			  handle = it.next();
			  if(current_handle==handle){
				  continue;
			  }
			  //�����´���,������´��ڵ�driver - newWindow
			  System.out.println("�����´���,������´��ڵ�driver");
			  newWindow  = driver.switchTo().window(handle);
			 // System.out.println("newWindow"+newWindow);
		  }
		  return newWindow;
	}


}
