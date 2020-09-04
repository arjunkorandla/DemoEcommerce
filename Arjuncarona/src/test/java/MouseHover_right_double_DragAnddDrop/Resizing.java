package MouseHover_right_double_DragAnddDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(drag).dragAndDropBy(drag, 150, 150).build().perform();
		
}
}