package links_alerts_Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");
		WebDriver object = new ChromeDriver();
		object.get("https://mail.rediff.com/cgi-bin/login.cgi");
		object.manage().window().maximize();

		//object.switchTo().frame(0);
		System.out.println(object.getCurrentUrl());
		//object.switchTo().frame(1);
		//object.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("whwre is balakrishna");
		//object.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("whwre is balakrishna");
		//object.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
		List <WebElement>links = object.findElements(By.tagName("a"));
		System.out.println(links.size());
		//this is toget the list of links in the web page
		
		/*Thread.sleep(5000);
		for (WebElement e: links)
		{
			System.out.println("the total num of links and list" + e);
		}*/
		
		object.findElement(By.id("login1")).sendKeys("arjun");
		//object.findElement(By.id("password")).sendKeys("arjun");
		object.findElement(By.xpath(" /html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
		
		//Aleart of pop:
		
		Thread.sleep(5000);
		object.switchTo().alert().accept();
		
		object.findElement(By.xpath(" //*[@id=\"top_news_container\"]/ul[1]/li[2]/a")).click();
		object.navigate().back();
		
		
		
	}

}
