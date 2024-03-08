package org.example;

import com.google.common.collect.ImmutableList;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.network.Network;

import java.util.Optional;

public class Blockul {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        DevTools devTools=driver.getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
        devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpeg")));
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");

        driver.findElement(By.xpath("//a[contains(text(),'Browse')]")).click();
    }
}
