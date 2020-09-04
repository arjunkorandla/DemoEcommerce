package links_alerts_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");
		WebDriver object = new ChromeDriver();
		object.get(" https://www.selenium.dev/selenium/docs/api/java/index.html ");
		object.manage().window().maximize();
		
		object.switchTo().frame("packageListFrame");//frame1
		object.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		
		object.switchTo().defaultContent(); // it go back to the main page
		
		object.switchTo().frame("packageFrame");//frame2
		object.findElement(By.linkText("ChromeDriver")).click();
		object.switchTo().defaultContent();
		
		object.switchTo().frame("classFrame");//frame3
		object.findElement(By.xpath("/html/body/div[3]/h2")).click();
		
		
		
		
		//object.findElement(By.linkText("com.thoughtworks.selenium "));
		
	}

}
