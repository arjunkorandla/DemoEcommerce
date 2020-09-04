/*
package Sukuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.api.Screen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

import java.awt.*;
import java.awt.image.BufferedImage;

public class orangeHRMA_SSIGNMENT {
	public static void main(String args[]) throws InterruptedException, FindFailed
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().window().maximize();
    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	
	driver.findElement(By.name("Submit")).click();
	WebElement PIM = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
	WebElement emplist = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]"));
	WebElement addemp = driver.findElement(By.xpath("//*[@id=\'menu_pim_addEmployee\']"));
	Actions act = new Actions(driver);
	act.moveToElement(PIM).moveToElement(emplist).moveToElement(addemp).click().build().perform();
	driver.findElement(By.xpath("//*[@id=\"photofile\"]")).click();
	String selectionPath = "C://Users//koran//Desktop//New folder (3)";
	String imgPath = "C://Users//koran//Desktop//New folder (3)";
	if(isFileExists("C://Users//koran//Desktop//New folder (3)/select.PNG"))
	{
		System.out.println("the file is exists");
	}
	else
	{
		System.out.println("the file not exists");
	}
	if(isFileExists("C://Users//koran//Desktop//New folder (3)/option.PNG"))
	{
		System.out.println("the file is exists");

	}
	else
	{
		System.out.println("the file not exists");

	}
	Screen s = new Screen() {
        @Override
        public BufferedImage getScreenshot(int x, int y, int width, int height) {
            return null;
        }

        @Override
        public Dimension getSize() {
            return null;
        }
    };
	Pattern inpitfiletext = new Pattern(selectionPath+ "select.PNG");
	Pattern button = new Pattern(selectionPath+"option.PNG");
	s.wait(inpitfiletext,10);
	s.type(inpitfiletext,imgPath+"apple.jpg");
	s.click(button);
	
	
	
	
}

	static boolean isFileExists(String path) {
		
		
		 
		 return false;
	}
	}
*/
