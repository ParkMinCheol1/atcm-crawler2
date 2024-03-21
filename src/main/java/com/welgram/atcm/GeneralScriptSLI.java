package com.welgram.atcm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GeneralScriptSLI  {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\crawler\\driver\\chromedriver.exe");

        System.out.println("1");
        GeneralScriptSLI test = new GeneralScriptSLI();
    }

    public GeneralScriptSLI() {
        WebDriver driver;
        ChromeOptions chromeOptions;

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        String url = "https://naver.com";
        driver.get(url);


    }

}
