package MouseHover_right_double_DragAnddDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		WebElement user_mngmnt = driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement user = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		
		Actions mouseAction = new Actions(driver);
	
		mouseAction.moveToElement(admin).moveToElement(user_mngmnt).moveToElement(user).build().perform();
	}

}
