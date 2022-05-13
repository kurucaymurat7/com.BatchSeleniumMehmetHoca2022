package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com/");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println("actual title : " + driver.getTitle());
        System.out.println("current url: " + driver.getCurrentUrl());
    }
}
