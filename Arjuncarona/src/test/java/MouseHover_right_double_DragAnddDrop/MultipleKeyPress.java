package MouseHover_right_double_DragAnddDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeyPress {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.CONTROL+"a").build().perform();
		act.sendKeys(Keys.CONTROL+"c").build().perform();
		WebElement key = driver.findElement(By.name("userName"));
		act.sendKeys(key, Keys.CONTROL+ "v");
		
		
}
}
