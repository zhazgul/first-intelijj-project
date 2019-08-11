package com.app;

public class HelloWorld {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/zhazgulpirmatova/Desktop/webdriver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // step1 navigate to the google homepage
        driver.get("http://.etsy.com");

        System.out.println("Hello");

        // adding comments
    System.out.println("adding another line");
    }

}
