package MouseHover_right_double_DragAnddDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,2000)","");
		//WebElement flag = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		//js.executeScript("arguments[0].scrollIntoView();",flag);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
		
	}
	
	
	
		
}
