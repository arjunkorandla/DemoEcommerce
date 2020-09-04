package MouseHover_right_double_DragAnddDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement doubleClick = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		act.doubleClick(doubleClick).build().perform();
		
		
		
		
		
		
		
}}
