import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sel1{
    @BeforeClass
    void set() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\703337600\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    }
    @Test(dataProvider = "data",dataProviderClass = data.class)
    public void myFirsttest(String a, String b) throws InterruptedException {
        WebDriver driver =  DriverFactory.getInstance().getDriver(BrowserType.CHROME);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement res = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
        res.sendKeys(a);
        res.submit();
        WebElement res1 = driver.findElement(By.xpath("//span[@id=\"cwos\"]"));
        Assert.assertEquals(res1.getText(), b);
        driver.quit();
    }
//    @Test(dataProvider = "data",dataProviderClass = data.class)
//    public void search(String a,String b) throws InterruptedException {
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.youtube.com/");
//        Thread.sleep(5000);
//       WebElement element= driver.findElement(By.xpath("//input[@id=\"search\"]"));
//       element.sendKeys(a);
//       element.submit();
//
//    }

}

