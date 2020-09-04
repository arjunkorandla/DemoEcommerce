
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class inclss {


        public static void main(String[] args) throws InterruptedException {
            // TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver", "C:\\Drverssel\\cromedrivers\\chromedriver.exe");
            WebDriver object = new ChromeDriver();

            object.get("https://llosite.z9.web.core.windows.net/Aut1_info.html");
            object.findElement(By.xpath("/html/body/a[1]/img")).click();

        }}


