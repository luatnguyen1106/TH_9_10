package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownBobabop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://store.bobapop.com.vn/san-pham/tra-sua-okinawa";
        
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
        
        WebElement chonMonthem = driver.findElement(By.xpath("//div[@id='dd']"));
        chonMonthem.click();
        
	}

}
