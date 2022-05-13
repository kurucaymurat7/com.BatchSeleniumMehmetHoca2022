package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        ileride wait konusu daha geniş incelenecek.
        bir sayfs acilirken, elementlere göre yüklenme süresine ihtiyaç vardır.
         */


    }
}
