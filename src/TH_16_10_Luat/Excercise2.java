package TH_16_10_Luat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Excercise2 extends Abstract {
	@Test (priority = 1)
    public static void Testcase1() {
        WebElement register = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
        register.click();
        
        String Username = "TanLuat";
        String password = "123456";
        String Cfpassword = password;
        
        WebElement Username_input= driver.findElement(By.xpath("//*[@id=\"email\"]"));
        Username_input.clear();
        Username_input.sendKeys(Username);

        WebElement password_input= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
        password_input.clear();
        password_input.sendKeys(password);
        
        WebElement Cfpassword_input= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
        Cfpassword_input.clear();
        Cfpassword_input.sendKeys(Cfpassword);
        
        WebElement bntpassword_input= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
        bntpassword_input.click();

        String expectedRegister = "Register: Mercury Tours";
        String actualRegister = driver.getTitle();
        Assert.assertEquals(actualRegister, expectedRegister);
    }
}
