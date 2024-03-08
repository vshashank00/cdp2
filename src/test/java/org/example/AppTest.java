package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.emulation.Emulation;
import org.openqa.selenium.devtools.v122.fetch.model.AuthChallengeResponse;
import org.openqa.selenium.devtools.v122.network.Network;
import org.openqa.selenium.devtools.v122.network.model.Response;

import java.util.HashMap;
import java.util.Optional;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver=new ChromeDriver();
//        DevTools devTools=driver.getDevTools();
//        devTools.createSession();
//        devTools.send(Emulation.setDeviceMetricsOverride(600,1000,50,true,Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()));
//        driver.get("https://www.youtube.com/watch?v=IBqO6aUkJSE");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        DevTools devTools=driver.getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
        devTools.addListener(Network.responseReceived(),response -> {
            Response r =response.getResponse();
            if (r.getStatus().toString().equals("200"))
            {
                System.out.println(r.getUrl());}
        });
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.xpath("//button[contains(text(),' Virtual')]")).click();
//        devTools.send(Emulation.setGeolocationOverride(Optional.of(40.4168), Optional.of(3.7038), Optional.empty()));
//        HashMap<String, Object> hm=new HashMap<>();
//        hm.put("latitude",40);
//        hm.put("longitude",3);
//        hm.put("accuracy",1);
//        driver.executeCdpCommand("Emulation.setGeolocationOverride",hm);
//        driver.get("https://www.google.com/");
//        driver.findElement(By.name("q")).sendKeys("restaurent near me", Keys.ENTER);
    }
}
