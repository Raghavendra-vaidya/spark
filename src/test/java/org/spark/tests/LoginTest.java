package org.spark.tests;

import org.spark.configuration.CreateWebDriver;
import org.testng.annotations.Test;

public class LoginTest {


    @Test(description = "This is test desc")
    public void abc(){
        CreateWebDriver.instance("chrome").get("https://facebook.com");
    }
}
