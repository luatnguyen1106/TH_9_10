package TH_23_10_Luat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TH_23_10_Luat.Listener.class)

public class Excercise1 extends Abstract {
	
	@Test (priority = 1)
	public static void Testcase1() {
		beforeTest();
		String expectedTile = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTile);
		tearDown();
	
	}
	
	@Test (priority = 2)
	public static void Testcase2() {
		beforeTest();
		WebElement btnRegister = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		btnRegister.click();
		
		String expectedTile = "Register: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTile);
		tearDown();
	}
	@Test (priority = 3)
	public static void Testcase3() {
		beforeTest();
		WebElement btnHome = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"));
		btnHome.click();
		
		String expectedTile = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTile);
		tearDown();
	}
	@Test (priority = 4)
	public static void Testcase4() {
		beforeTest();
		WebElement btnSupport = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a"));
		btnSupport.click();
		
		String expectedTile = "Under Construction: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTile);
		tearDown();
	}
	@Test (priority = 5)
	public static void Testcase5() {
		beforeTest();
		WebElement btnHome = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a"));
		btnHome.click();
		
		String expectedTile = "Under Construction: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTile);
		tearDown();
	}
}
