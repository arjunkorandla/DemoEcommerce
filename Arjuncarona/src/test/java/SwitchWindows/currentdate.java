
package SwitchWindows;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currentdate {
	public static WebDriver object;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		 object = new ChromeDriver();
		object.get("https://testautomationpractice.blogspot.com/");
		object.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		selectCurrentDate();
	}
		static void selectCurrentDate()
		
		{
			Calendar cal = Calendar.getInstance();
			int d = cal.get(Calendar.DATE);
			String Date = String.valueOf(d);
			object.findElement(By.partialLinkText(Date)).click();
			
		
		
		
	}

	

}
