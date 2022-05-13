package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println(driver.getWindowHandle());
        driver.get("https://www.amazon.com");
        //CDwindow-7D11524F5B24F6CAF607ACA8044CD131

    }
}
