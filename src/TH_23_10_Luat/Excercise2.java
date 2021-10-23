package TH_23_10_Luat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TH_23_10_Luat.Listener.class)

public class Excercise2 extends Abstract {
	private static String Username = "tantuat";
    private static String password = "123456";
    private static String Cfpassword = password;
    
    @Test (priority = 1)
    public static void Testcase1() {
        System.out.println("REGISTER");
        
        WebElement register = driver.findElement(By.linkText("REGISTER"));
        register.click();
        
        
        WebElement Username_input= driver.findElement(By.id("email"));
        Username_input.clear();
        Username_input.sendKeys(Username);

        WebElement password_input= driver.findElement(By.name("password"));
        password_input.clear();
        password_input.sendKeys(password);
        
        WebElement Cfpassword_input= driver.findElement(By.name("confirmPassword"));
        Cfpassword_input.clear();
        Cfpassword_input.sendKeys(Cfpassword);
        
        WebElement bntpassword_input= driver.findElement(By.name("submit"));
        bntpassword_input.click();

        
        String expectedRegister = "sign-in";
        
        String actualRegister = driver.findElement(By.linkText("sign-in")).getText();
        
        if (actualRegister.equals(expectedRegister)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        tearDown();
    }
    
    
    
    @Test (priority = 2)
    public void Testcase2() {
        beforeTest();
        System.out.println("LOGIN");
        WebElement login_button = driver.findElement(By.linkText("SIGN-ON"));
        login_button.click();
        
        WebElement Username_input= driver.findElement(By.name("userName"));
        Username_input.clear();
        Username_input.sendKeys(Username);
        
        WebElement password_input= driver.findElement(By.name("password"));
        password_input.clear();
        password_input.sendKeys(password);
        
        WebElement bntpassword_input= driver.findElement(By.name("submit"));
        bntpassword_input.click();
        
        String expectedLogin = "Login Successfully";
        String actualLogin = driver.findElement(By.xpath("//div//table//tbody//tr//td//h3")).getText();
        
        if (actualLogin.equals(expectedLogin)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        tearDown();
    }
    public void Testcase3() {
        beforeTest();
        System.out.println("FIND FIGHT");
        WebElement flight = driver.findElement(By.linkText("Flights"));
        flight.click();

        WebElement continue_button = driver.findElement(By.name("findFlights"));
        continue_button.click();

        String exeFindFailed = "After flight finder - No Seats Avaialble";

        String actFindFailed = driver.findElement(By.xpath("//table/tbody/tr[1]/td/p/font/b")).getText();

        if (actFindFailed.equals(exeFindFailed)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        tearDown();
    }
}
