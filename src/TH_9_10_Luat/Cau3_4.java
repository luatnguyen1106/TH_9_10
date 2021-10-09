package TH_9_10_Luat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cau3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://bobapop.com.vn/menu/";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        WebElement baseTable = driver.findElement(By.tagName("Table"));
        
        WebElement tableRow = baseTable.findElement(By.xpath("/html/body/main/section[1]/div/ul[1]/li[2]/div/table/tbody/tr[3]"));
        
        WebElement tableRowText = baseTable.findElement(By.xpath("/html/body/main/section[1]/div/ul[1]/li[2]/div/table/tbody/tr[3]/td[1]"));
        
        String rowtext = tableRow.getText();
        System.out.println("Third row of table: " + rowtext);
        
        WebElement cellIneed = tableRow.findElement(By.xpath("/html/body/main/section[1]/div/ul[1]/li[2]/div/table/tbody/tr[3]/td[2]"));
        String valueIneed = cellIneed.getText();
        System.out.println("Cell value is: " + valueIneed);
        
        //driver.close();
	}

}
