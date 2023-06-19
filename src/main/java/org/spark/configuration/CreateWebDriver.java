package org.spark.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class CreateWebDriver {

    public static WebDriver instance(String browser){
        WebDriver driver = null;
        if (browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();

            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            options.setImplicitWaitTimeout(Duration.ofSeconds(3));
            options.setScriptTimeout(Duration.ofSeconds(3));

            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setImplicitWaitTimeout(Duration.ofSeconds(3));
            firefoxOptions.setScriptTimeout(Duration.ofSeconds(3));

            driver = new FirefoxDriver(firefoxOptions);
            driver.manage().window().maximize();
        }

        return driver;
    }

}
