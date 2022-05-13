package day01;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class IlkClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        element.click();
        element.sendKeys("nutella");
        element.submit();
        driver.close();
    }
}
