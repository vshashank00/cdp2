import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.sun.org.apache.xpath.internal.compiler.Token.contains;

public class LoginTest {

@DataProvider(name = "data2")
Object[][] data(){
    Object[][] data={{"student","Password123"}};
    return data;

    }

@Test(dataProvider = "data2")
    void login(String c,String b){
    String s="//div[@id='form']/descendant::";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\703337600\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(s+"input[@id=\"username\"]")).sendKeys(c);
        driver.findElement(By.xpath(s+"input[@id=\"password\"]")).sendKeys(b);
        WebElement element=driver.findElement(By.xpath("//button[@id=\"submit\"]"));
        element.click();
        Assert.assertEquals(driver.getTitle(),"Logged In Successfully | Practice Test Automation");
        Assert.assertTrue(driver.findElement(By.xpath("//strong[1]")).isDisplayed());

    }
}
