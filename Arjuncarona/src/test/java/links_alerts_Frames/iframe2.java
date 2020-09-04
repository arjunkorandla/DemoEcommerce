package links_alerts_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");
		WebDriver object = new ChromeDriver();
		object.manage().window().maximize();
		object.get("http://demo.automationtesting.in/Frames.html");
		object.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		WebElement outerframe = object.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		object.switchTo().frame(outerframe);
		WebElement innerframe = object.findElement(By.xpath("/html/body/section/div/div/iframe"));
		object.switchTo().frame(innerframe);
		object.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("my name is arjun");
		
		
		
		
		
		
		
		

	}

}
