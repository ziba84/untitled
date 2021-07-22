package com.cybertek.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;// when we dont assign any thing is null by default

    // creat reusable method that will return same 'driver' instance everytime we call it

    public static WebDriver getDriver(){
        if(driver==null){
            /*
            we read our browser type from configuration file using .getProperty method we
            creating in configuration Reader class.
             */
            String browserType= ConfigurationReader.getProperty("browser");

            /*
            Depending on the browser type our switch statement will determine
            to open specific type of browser/driver
             */

            // we use this not testBase we use this test base just for practice
            switch(browserType){

                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    break;

            }

        }
        /*
        Same driver instance will be return every time we call Driver.getDriver(); method
         */
        return driver;
    }

    /*
    this method makes sure we have some form of driver session or driver id has.
    either null or not null it must exit
     */
    public static void closeDriver(){
        if(driver!=null){//to be able to creat our good flow,when we use driver quit session will killed if driver is not there
            driver.quit();
            driver=null;
        }
    }
}
