package package01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HelloSelenium {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.getTitle(); // => "Google"

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");
        searchButton.click();

        searchBox = driver.findElement(By.name("q"));
        System.out.println(searchBox.getAttribute("name")); // => "Selenium"
        //name="q"

        Thread.sleep(5000);

        driver.quit();
    }
}
