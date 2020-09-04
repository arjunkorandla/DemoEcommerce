package MouseHover_right_double_DragAnddDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DubleClick2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://api.jquery.com/dblclick/");
		
		
		driver.manage().window().maximize();
		Actions act  = new Actions(driver);
		WebElement Headder = driver.findElement(By.xpath("//*[@id=\"dblclick-handler\"]"));
		WebElement Headder2 = driver.findElement(By.xpath("//*[@id=\"dblclick-eventData-handler\"]"));
		WebElement Headder3 = driver.findElement(By.xpath("//*[@id=\"dblclick-eventData-handler\"]"));
		act.doubleClick(Headder).build().perform();
		Thread.sleep(2000);
		act.doubleClick(Headder2).build().perform();
		Thread.sleep(2000);
		act.doubleClick(Headder3).build().perform();
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		WebElement doubleclick2 = driver.findElement(By.xpath("/html/body/div"));
		
		
		act.doubleClick(doubleclick2).build().perform();
		
		
		
		
		
		
		
		
}}
