package MouseHover_right_double_DragAnddDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement i = driver.findElement(By.id("box106"));
		WebElement s = driver.findElement(By.id("box107"));
		WebElement n = driver.findElement(By.id("box101"));
		WebElement d = driver.findElement(By.id("box104"));
		WebElement sk = driver.findElement(By.id("box105"));
		WebElement sw = driver.findElement(By.id("box102"));
		WebElement us = driver.findElement(By.id("box103"));
		
		
		//Capital citys-------------------------------
		
		WebElement i1 = driver.findElement(By.id("box6"));
		WebElement s1 = driver.findElement(By.id("box7"));
		WebElement n1 = driver.findElement(By.id("box1"));
		WebElement d1 = driver.findElement(By.id("box4"));
		WebElement sk1 = driver.findElement(By.id("box5"));
		WebElement sw1 = driver.findElement(By.id("box2"));
		WebElement us1 = driver.findElement(By.id("box3"));
		Actions act = new Actions(driver);
		act.dragAndDrop(s, s1).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(i, i1).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(n, n1).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(d, d1).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(sk, sk1).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(sw, sw1).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(us, us1).build().perform();
		
		
		
	}
}