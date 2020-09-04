package SwitchWindows;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver object = new ChromeDriver();
		object.get("http://demo.automationtesting.in/Windows.html");
		
		object.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();//this will click on to navgate another window.
		Set<String> handlewindows = object.getWindowHandles();
		for (String w:handlewindows)
		{
			System.out.println(w);	
			String title = object.switchTo().window(w).getTitle();
			System.out.println(title);
			if (title.equalsIgnoreCase( "Sakinalium | Home"))
			{
				object.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[2]/ul/li[4]/a")).click();//thiswillclick on contact
				object.switchTo().defaultContent();
				object.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[2]/ul/li[3]/a")).click();
				//object.switchTo().defaultContent();
				//Select list = new Select(object.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[1]/div/ul/li[1]/a")));
				//int options =  list.getOptions().size();
				//System.out.println(options);
				System.out.println(title);
				
				break;
			}
			
			
			}
		
		
		object.switchTo().defaultContent();
		Select list = new Select(object.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[1]/div/ul/li[1]/a")));
		int options =  list.getOptions().size();
		System.out.println(options);
		
		
	}

}
