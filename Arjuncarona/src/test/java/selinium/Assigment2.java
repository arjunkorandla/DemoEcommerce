package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");
		WebDriver object = new ChromeDriver();
		object.get("https://goo.gl/RVdKM9");
		
		object.manage().window().maximize();
		String title= object.getTitle();
		System.out.println("This is page title" + title);
		String url = object.getCurrentUrl();
		object.getPageSource();
		System.out.println("This is page url" + url);
		object.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Arjun");
		object.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("Korandla");
		object.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("5145688679");
		object.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("india");
		object.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("hyderabad");
		object.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("arjunkorandla@gmail.com");
		
	
		
		//WebElement dropdown = object.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
				//Select option = new Select(dropdown);	
				Select dropdown = new Select(object.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")));
				System.out.println("There are: "+ dropdown.getOptions().size());
				//selecting the options so we are uning list<web Element > data type to get the options.
				List<WebElement > options = dropdown.getOptions();
				System.out.println(options);
				for(WebElement e:options)
				{
				System.out.println(e.getText());	
				}
				//3) Select option from the dropdown 
				//dropdown.selectByVisibleText("Morning");
				//dropdown.selectByIndex(3); //Evening  --> index starts from 0
				dropdown.selectByValue("Radio-1"); //aFTERNOON
				//dropdown.selectByVisibleText("Morning");
				//dropdown.selectByValue("Radio-1");
				//dropdown.selectByIndex(0);
				object.findElement(By.id("FSsubmit")).click();
				object.navigate().back();
				object.findElement(By.linkText("Software Testing Tutorials")).click();
				object.navigate().back();
				object.findElement(By.partialLinkText(" Tools Training")).click();
				Thread.sleep(3000);

				object.navigate().back();
				
				System.out.println(object.getTitle());
				object.navigate().back(); // go back to your previous page
				
				
				
				//object.findElement(By.linkText("Software Testing Tutorials ")).click();
				//selecting the day 
				
				
				//object.findElement(By.id("RESULT_CheckBox-8_0")).click();
				//object.findElement(By.id("RESULT_CheckBox-8_1")).click();
				
				
		
		
		//Handling redio but
		WebElement Radiomale = object.findElement(By.id("RESULT_RadioButton-7_1"));
		//WebElement radmale=driver.findElement(By.id("RESULT_RadioButton-8_0"));
		System.out.println("IS this displayed " + Radiomale.isDisplayed());
		System.out.println("is ths enabled? " + Radiomale.isEnabled());
		System.out.println("Is selected or not" + Radiomale.isSelected());
		Radiomale.click();
		System.out.println("This is after selected" + Radiomale.isSelected());
		
		
		
		
		
		

	}

}
