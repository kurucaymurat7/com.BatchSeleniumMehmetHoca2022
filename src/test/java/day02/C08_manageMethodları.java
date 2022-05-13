package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        System.out.println("maximize iken boyutlar");
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        System.out.println("full screen iken boyutlar");
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

    }
}
