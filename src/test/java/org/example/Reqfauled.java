package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.fetch.Fetch;
import org.openqa.selenium.devtools.v122.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v122.fetch.model.RequestPaused;
import org.openqa.selenium.devtools.v122.network.model.ErrorReason;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reqfauled {
    public static void main(String[] args) throws InterruptedException {


      WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    DevTools devTools=driver.getDevTools();
        devTools.createSession();
        //see 246
      Optional<List<RequestPattern>> requestPatterns = Optional.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"),Optional.empty(),Optional.empty())));
        devTools.send(Fetch.enable(requestPatterns, Optional.empty()));
        devTools.addListener(Fetch.requestPaused(),requestPaused -> {
            devTools.send(Fetch.failRequest(requestPaused.getRequestId(), ErrorReason.FAILED));
            System.out.println(requestPaused.getResponseStatusCode().toString());
        });
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");

        driver.findElement(By.xpath("//button[contains(text(),' Virtual')]")).click();

    }
}
