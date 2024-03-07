import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static com.sun.org.apache.xpath.internal.compiler.Token.contains;

public class Automate {
    WebDriver driver;

    @BeforeClass
    void set() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\703337600\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    }

    @BeforeMethod
    void drive() {
        driver = DriverFactory.getInstance().getDriver(BrowserType.CHROME);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }

    @Test
    void assignment1() {

        String s = "//input[@id=\"checkBoxOption";
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        for (int i = 1; i < 4; i++) {
            driver.findElement(By.xpath(s + i + "\"]")).click();
            Assert.assertTrue(driver.findElement(By.xpath(s + i + "\"]")).isSelected());
        }
        for (int i = 1; i < 4; i++) {
            driver.findElement(By.xpath(s + i + "\"]")).click();
            Assert.assertFalse(driver.findElement(By.xpath(s + i + "\"]")).isSelected());
        }
        System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
    }

    @DataProvider(name = "data" ,parallel = true)
    Object[][] hello() {
        Object[][] data = {{"Shashank", "vshashank00@gmail.com", "vshashank00@gmail.com", "12/14/2000"}};
        return data;

    }

    @Test(dataProvider = "data")
    void form(String name, String email, String pass, String date) {
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id=\"exampleInputPassword1\"]")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@id=\"exampleCheck1\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"inlineRadio1\"]")).click();
        WebElement ele = driver.findElement(By.xpath("//input[@type=\"date\"]"));
        ele.sendKeys(date);
        ele.submit();
        System.out.println(driver.findElement(By.xpath("//strong/parent::div")).getText());
        Assert.assertEquals(contains(driver.findElement(By.xpath("//strong/parent::div")).getText()), contains("Success! The Form has been submitted successfully!."));
        driver.quit();
    }

    @Test
    void greenKart() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String cucuXpath = "//h4[text()=\"Cucumber - 1 Kg\"]//parent::div/";
        for (int i = 0; i < 20; i++) {
            driver.findElement(By.xpath(cucuXpath + "div[2]/a[2]")).click();
        }
        driver.findElement(By.xpath(cucuXpath + "div[3]/child::button")).click();
        driver.findElement(By.xpath("//h4[text()=\"Walnuts - 1/4 Kg\"]//parent::div/div[3]/button")).click();
        driver.findElement(By.xpath("//a[@href=\"#\"]/img[@alt=\"Cart\"]")).click();
        driver.findElement(By.xpath("//button[contains(text(),\"PROCEED TO CHECKOUT\")]")).click();
        driver.findElement(By.xpath("//button[text()=\"Place Order\"]")).click();
        WebElement element = driver.findElement(By.xpath("//label[text()=\"Choose Country\"]/parent::div/div/select"));
        Select sc = new Select(element);
        sc.selectByVisibleText("India");
        driver.findElement(By.xpath("//input")).click();
        driver.findElement((By.xpath("//button"))).click();
        Thread.sleep(3000);
        driver.quit();
    }


    @Test
    void loginPage() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("learning");
        driver.findElement(By.xpath("//input[@value=\"user\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"okayBtn\"]"))).click();
        WebElement ele = driver.findElement(By.xpath("//select"));
        Select sc = new Select(ele);
        sc.selectByVisibleText("Consultant");
        driver.findElement(By.xpath("//input[@id=\"terms\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"signInBtn\"]")).click();
        Thread.sleep(3000);
        List<WebElement> l = driver.findElements(By.xpath("//app-card"));
        for (WebElement w : l) {
            w.findElement(By.xpath("//button[text()=\"Add \"]")).click();
        }
        driver.findElement(By.xpath("//a[contains(text(),\"Checkout\")]")).click();
        driver.findElement(By.xpath("//button[contains(text(),\"Checkout\")]")).click();
        driver.findElement(By.xpath("(//input)[1]")).sendKeys("ind");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"suggestions\"]/ul")));
        List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"suggestions\"]/ul"));
        for (WebElement i : list) {


            if (i.getText().equalsIgnoreCase("India")) {
                i.click();
                break;
            }
        }
        driver.findElement(By.xpath("(//input)[3]")).click();
        driver.quit();

    }

    @Test
    void action() {
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        Actions a = new Actions(driver);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
        a.moveToElement(driver.findElement(By.xpath("(//a)[1]"))).click().build().perform();
//        String winHandleBefore = driver.getWindowHandle();

        Set<String> tab = driver.getWindowHandles();
        String email = "";
        for (String i : tab) {
            driver.switchTo().window(i);
            if (driver.getTitle().equalsIgnoreCase("RS Academy")) {
                w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")));
                email = driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText();
                driver.close();
                driver.switchTo().window(tab.iterator().next());
                break;
            }
        }
        System.out.println(email);
        String text = driver.findElement(By.xpath("//p[contains(text(),\"(username is \")]")).getText().split("is")[1].split(" ")[1];
        System.out.println(text);
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(email);

    }

    @Test
    void frame() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name=\"frame-top\"]")));
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]")));
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

    }

    @Test
    void Alert() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//label[@for=\"honda\"]/child::input[@value=\"option3\"]")).click();
        String s = driver.findElement(By.xpath("//label[@for=\"honda\"]")).getText();
        WebElement element = driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
        Select sc = new Select(element);
        sc.selectByVisibleText(s);
        driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys(s);
        driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
        System.out.println(driver.switchTo().alert().getText().split(" ")[1].split(",")[0].equalsIgnoreCase(s));
        Assert.assertEquals(driver.switchTo().alert().getText().split(" ")[1].split(",")[0], s);
        driver.switchTo().alert().accept();
    }

    @Test
    void cal() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-notifications");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.spicejet.com/");

        driver.findElement(By.xpath("//div[@data-testid=\"departure-date-dropdown-label-test-id\"]/descendant::div[4]")).click();
        int i = 0;
        List<WebElement> webElement = driver.findElements(By.xpath("//div[@class=\"css-76zvg2 r-homxoj r-adyw6z r-1kfrs79\"]"));
        for (WebElement web : webElement) {
            System.out.println(web.getText());
            if (!web.getText().contains("May")) {
                i++;
                if (i % 2 == 0)
                    driver.findElement(By.xpath("//div[@data-testid=\"undefined-calendar-picker\"]/child::div[1]")).click();
            } else break;
        }
        List<WebElement> list = driver.findElements(By.xpath("//div[@data-testid=\"undefined-month-May-2024\"]/descendant::div[contains(@data-testid,\"undefined-calendar-day\")]"));
        for (WebElement w : list) {
            if (w.getText().equalsIgnoreCase("17")) {
                w.click();
                break;
            }
        }
    }

    @Test
    void noRow() throws IOException, InterruptedException {

        driver.get("https://www.google.com/");
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String url = driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/&ogbl\"]")).getAttribute("href");
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        SoftAssert softAssert = new SoftAssert();
        int respCode = conn.getResponseCode();
        System.out.println(respCode);
//        driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("ind");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys(Keys.DOWN);
//        driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys(Keys.DOWN,Keys.ENTER);
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,660)");
//        System.out.println( driver.findElements(By.xpath("(//table[@id=\"product\"]/tbody)[1]/tr")).size());
//        System.out.println(driver.findElements(By.xpath("(//table[@id=\"product\"]/tbody)[1]/tr/th")).size());
//        System.out.println(driver.findElement(By.xpath("(//table[@id=\"product\"]/tbody)[1]/tr[3]")).getText());
//        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src,new File("C:/Users/703337600/screenshot.png"));
    }

    @Test(priority = 1)
    void sortStream() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//span[contains(text(),\"Veg/fruit name\")]")).click();
        List<WebElement> list = driver.findElements(By.xpath("//tr/child::td[1]"));
        List<String> li = list.stream().map(s -> s.getText()).sorted().collect(Collectors.toList());
        for (int i = 0; i < li.size(); i++) {
            if (Objects.equals(li.get(i), list.get(i).getText())) {
                System.out.println(li.get(i) + "=" + list.get(i).getText());
            }
        }
        list.stream().map(s -> s.getText().equalsIgnoreCase("Banana")).forEach(s -> System.out.println(driver.findElement(By.xpath("//tr/child::td[text()='Banana']/following-sibling::td[1]")).getText()));
        for (WebElement i : list) {
            if (i.getText().equalsIgnoreCase("Banana")) {
                System.out.println(driver.findElement(By.xpath("//tr/child::td[text()='Banana']/following-sibling::td[1]")).getText());
            }

        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/child::input[@id=\"search-field\"]")).sendKeys("Rice");
        List<WebElement> list1 = driver.findElements(By.xpath("//tr/child::td[1]"));

        List<WebElement> a = list1.stream().filter(s -> s.getText().contains("Rice")).collect(Collectors.toList());
        Assert.assertEquals(list1.size(), a.size());

    }

    @Test(enabled = true,priority = 1)
    void multiTab() throws AWTException, InterruptedException {
        driver.get("https://courses.rahulshettyacademy.com/courses/");
        String cname=driver.findElement(By.xpath("//div[@title=\"All-Access Membership\"]")).getText();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_T);
        WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(2));
        w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@title=\"All-Access Membership\"]")));
        Set<String>s=driver.getWindowHandles();
        Iterator<String> iterator=s.iterator();
        String s2=iterator.next();
        String s3=iterator.next();
        driver.switchTo().window(s3);
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("(//input)[1]")).sendKeys(cname);



    }
}