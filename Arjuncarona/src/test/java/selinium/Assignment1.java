package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); 
		 driver.get("http://newtours.demoaut.com");
			driver.findElement(By.name("userName"));
			WebElement userName=driver.findElement(By.name("userName"));
			userName.sendKeys("mercury");
			//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
			String title = driver.getTitle();
			String act_title = "Find a Flight: Mercury Tours:";
			if (title == act_title)
			{
			System.out.println("titles are same");	

			}
			
			

	}}
