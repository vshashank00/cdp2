import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.remote.Browser.CHROME;
import static org.openqa.selenium.remote.Browser.FIREFOX;

public class DriverFactory {
    //Singleton design pattern
    private static final DriverFactory instance = new DriverFactory();

    private DriverFactory(){
    }

    public static DriverFactory getInstance(){
        return instance;
    }

    //Factory design pattern
    private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();




    public WebDriver getDriver ( BrowserType type) {
        threadLocal.set(new ChromeDriver());
        if (threadLocal.get() == null) {
            if (type==BrowserType.CHROME)
                    threadLocal.set(new ChromeDriver());
            else if (type==BrowserType.FIREFOX)
                threadLocal.set(new FirefoxDriver());
        }
        return threadLocal.get();
    }

}
