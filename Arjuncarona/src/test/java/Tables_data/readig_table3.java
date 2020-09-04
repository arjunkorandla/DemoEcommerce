package Tables_data;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readig_table3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[4]")).click();
		List<WebElement> list =  driver.findElements(By.xpath("//*[@id=\"select-demo\"]/option"));
		System.out.println(list.size());
		System.out.println(list.get(3));
		String i = list.toString();
		System.out.println(i);
		
	}

}
