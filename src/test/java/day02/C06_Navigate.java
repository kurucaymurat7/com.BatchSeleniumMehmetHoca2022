package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);

        //amazon'a geri dön
        driver.navigate().back();
        Thread.sleep(3000);

        //facebook'a forward et
        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.google.com");
        driver.close();

    }
}
