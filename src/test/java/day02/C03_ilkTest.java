package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ilkTest {
    public static void main(String[] args) {
        /* 1. https://www.amazon.com url'e gidin
        2. başlığın amazon içerdiğini test edin
        3. url'in "www.amazon.com" a eşit olduğunu test edin.
        4. sayfayı kapatın
         */
        System.setProperty("webdriver.chrome.driver", "Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        String title = driver.getTitle();
        System.out.println(driver.getTitle());
        if (title.contains("amazon") ||title.contains("Amazon")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        String url = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        if (url.equals("https://www.amazon.com/")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        driver.close();
    }
}
