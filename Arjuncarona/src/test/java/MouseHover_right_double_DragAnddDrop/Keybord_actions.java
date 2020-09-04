package MouseHover_right_double_DragAnddDrop;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keybord_actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/key_presses");
		
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ADD).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_LEFT).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).build().perform();

}
}