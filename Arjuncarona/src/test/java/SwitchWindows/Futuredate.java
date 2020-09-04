package SwitchWindows;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Futuredate {
	public static WebDriver object;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		
		object = new ChromeDriver();
		
		object.get("https://testautomationpractice.blogspot.com/");
		object.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		String date="25";
		String month="June";
		
		
		
		SelectFutureDate(date,month);
	}
		
		static void SelectFutureDate(String d, String mon)
		{
			Calendar cal =  Calendar.getInstance();
			int Cuttentmonth = cal.get(Calendar.MONTH)+1;
			
			
			for(int i = Cuttentmonth; i>=1; i++ )
			{
				object.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).click();
				String m = object.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).getText();
				//System.out.println(m);
				
				if(m.equals(mon)) 
				{
					//String futuredate =  object.findElement(By.linkText(d)).getText();
					//System.out.println(futuredate);
					object.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table")).click();
					break;
				}
			}
			
			
			
		}
		
		

	}



	

	

	


