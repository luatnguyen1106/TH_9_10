package TH_9_10_Luat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cau1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://bobapop.com.vn/menu/";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        List <WebElement> col = driver.findElements(By.xpath("/html/body/main/section[1]/div/ul[1]/li[2]/div/table/thead/tr/th"));
        System.out.println("No of cols are: " + col.size());
        
        List <WebElement> row = driver.findElements(By.xpath("/html/body/main/section[1]/div/ul[1]/li[2]/div/table/tbody/tr/td[1]"));
        System.out.println("No of row are: " + row.size());
        
        //driver.close();
	}
}
