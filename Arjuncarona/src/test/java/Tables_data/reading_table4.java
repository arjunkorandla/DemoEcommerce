package Tables_data;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reading_table4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[3]/a ")).click();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[3]/ul/li[3]/a")).click();
		driver.findElement(By.partialLinkText("Table")).click();
		driver.findElement(By.partialLinkText("All Examples")).click();
		driver.findElement(By.partialLinkText("Table")).click();
		
		driver.findElement(By.partialLinkText("Table Data Search")).click();
		driver.switchTo().defaultContent();

		//driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[3]/ul/li[2]/a")).click();
		int  rows = driver.findElements(By.xpath("//*[@id=\"task-table\"]/tbody/tr")).size();
		
		
		for(int  i = 1;i<=rows ; i++)
		{
			String c1 = driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr["+i+"]/td[1]")).getText();
			String c2 = driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr["+i+"]/td[2]")).getText();
			String c3 = driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr["+i+"]/td[3]")).getText();
			String c4 = driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr["+i+"]/td[4]")).getText();
			


			//*[@id="task-table"]/tbody/tr[1]/td[1]
			System.out.println(c1+ "          "+c2+"               "+c3+"            "+c4);
			

		}
		
		
		

	}

}
