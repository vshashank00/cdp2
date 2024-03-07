import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testng {

//    @DataProvider
//    public Object[][] data() {
//        return new String[][] {new String[] {"data1"}, new String[] {"data2"}};
//    }
//
//    @Test(dataProvider = "data")
//    public void test(String d) {
//        Assert.assertEquals("First Line\nSecond Line", "First Line\nSecond Line");
//    }
ExtentReports extentReports;
    @BeforeTest
    public void Reports(){
        String path=System.getProperty("user.dir")+"\\report\\index.html";
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(path);
        extentSparkReporter.config().setDocumentTitle("testreopt");
        extentSparkReporter.config().setReportName("testReport");
         extentReports=new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        extentReports.setSystemInfo("Test","sdet shashank");
    }
@Test(dataProvider = "hello")
public void myFirsttest(String a,String b) throws InterruptedException {
        extentReports.createTest("myFirsttest");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\703337600\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    WebElement res=driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
    res.sendKeys(a);
    res.submit();
    WebElement res1=driver.findElement(By.xpath("//span[@id=\"cwos\"]"));
    Assert.assertEquals(res1.getText(),b);

//            driver.findElement(By.xpath("//div[@aria-label='Search by voice']")).click();
//            Thread.sleep(5000);
    driver.quit();
    extentReports.flush();
}
    @DataProvider(name = "hello")
    public Object[][] data() {
        Object[][] data = {{"2+3", "5"}};
        return data;
//        or
//        return new Object[][] {
//                {"2+3","5"}
//        }
//                ;
    }
}