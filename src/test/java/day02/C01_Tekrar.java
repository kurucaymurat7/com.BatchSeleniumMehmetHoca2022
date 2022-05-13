package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com/");
    }
}
