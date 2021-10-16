package TH_16_10_Luat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Abstract {

		public static String baseURL = "http://demo.guru99.com/test/newtours/";
		public static WebDriver driver;
		
		@BeforeTest
		public void beforeTest() {
			System.out.println("Lauching chrome driver");
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(baseURL);
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		@AfterTest
		public void tearDown() {
			driver.close();
		}

	}


