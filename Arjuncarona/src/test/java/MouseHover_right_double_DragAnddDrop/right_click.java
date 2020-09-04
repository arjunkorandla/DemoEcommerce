package MouseHover_right_double_DragAnddDrop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class right_click {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		 WebElement Button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

		 act.contextClick(Button).build().perform();
		 driver.findElement(By.xpath("/html/body/ul/li[1]/span")).click();
		 Thread.sleep(2000);
		 Alert aleart = driver.switchTo().alert();
		System.out.println( aleart.getText());
		aleart.accept();
		
		 
		
		
		
		
		
		
}}
