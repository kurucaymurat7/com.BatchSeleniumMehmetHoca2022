package day04_xpath_cssSelectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_xpath {
    public static void main(String[] args) {
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //2- Add Element butonuna basin
        //3- Delete butonu’nun gorunur oldugunu test edin
        //4- Delete tusuna basin
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        System.setProperty("webdriver.chrome.driver", "Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

    }
}
