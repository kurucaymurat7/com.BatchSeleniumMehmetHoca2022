package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
        driver.navigate().to("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
        searchBox.sendKeys("nutella" + Keys.ENTER);

        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field "));
        //aramaKutusu.sendKeys("");

    }
}
