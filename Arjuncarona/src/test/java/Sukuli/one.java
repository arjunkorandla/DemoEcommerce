/*
package Sukuli;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.api.Screen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

import java.awt.*;
import java.awt.image.BufferedImage;

public class one {
	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();

		String inputimg = "C:\\Users\\koran\\Desktop\\java\\selinium\\ClassExamples\\FileUpload using Sikuli\\Fruites\\inputfiles";
		String inputselect = "C:\\Users\\koran\\Desktop\\java\\selinium\\ClassExamples\\FileUpload using Sikuli\\Fruites";

        Screen s;
        s = new Screen() {
            @Override
            public BufferedImage getScreenshot(int x, int y, int width, int height) {
                return null;
            }

            @Override
            public Dimension getSize() {
                return null;
            }
        };

        Pattern inpufilepath = new Pattern(inputselect + "FileTextBox.PNG");
		Pattern click = new Pattern(inputselect + "OpenButton.PNG");
		Thread.sleep(5000);
		s.wait(inpufilepath, 20);
		s.type(inpufilepath,inputimg+"apple.jpg");
		s.click(click);






}}
*/
