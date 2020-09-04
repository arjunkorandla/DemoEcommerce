package Tables_data;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDatainSidetheTable {public ReadingDatainSidetheTable() {
	// TODO Auto-generated constructor stub
}	public static WebDriver object;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		
		object = new ChromeDriver();
		object.get("https://opensource-demo.orangehrmlive.com/");
		object.findElement(By.id("txtUsername")).sendKeys("Admin ");
		object.findElement(By.id("txtPassword")).sendKeys("admin123");
		object.findElement(By.id("btnLogin")).click();
		//admin**usermanagement**user
		object.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		object.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
		object.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		//inside the table---
		
		
		int rows = object.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		//int rows= object.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		System.out.println(rows);
		int count =  0;
		for(int i = 1; i<= rows; i++ )
		{
			String status = object.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+i+"]/td[5]")).getText();
			if (status.equals("Enabled"))
			{
				count++;
			}
			
		}
		
		System.out.println("Number of enabled employees:"+ count);
		System.out.println("Number of disabled employees:"+ (rows-count));
		
		
		
		
		

	}

}
