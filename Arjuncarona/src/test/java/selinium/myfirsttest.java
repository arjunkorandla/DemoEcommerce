package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myfirsttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); 
		//2) Open URL  https://opensource-demo.orangehrmlive.com/
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername"));
			WebElement username=driver.findElement(By.id("txtUsername"));
			username.sendKeys("Admin");
			//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
			String title = driver.getTitle();
			String act_title = "OrangeHRM";
			if (title == act_title)
			{
			System.out.println("titles are same");	
			}
			else
			{
				System.out.println("titles are not same");
			}
			driver.close();
			
			
	}

}
