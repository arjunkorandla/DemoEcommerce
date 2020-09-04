package SwitchWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver object = new ChromeDriver();
		object.get("http://demo.automationtesting.in/Windows.html");
		String handlewindow = object.getWindowHandle();
		System.out.println(handlewindow);
		
		//object.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		

	}

}
