package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodları {
    public static void main(String[] args) {
        /*
        amazona git arama kutusunu locate et
        arama kutusunun tag name'inin input oldugunu tes et
        arama kutusunun name attribute degerininin ....
         */
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        String aramaKutusuTagName = aramakutusu.getTagName();
        String aramaKutusuName = aramakutusu.getAttribute("name");
        System.out.println(aramaKutusuName);
        System.out.println(aramaKutusuTagName);

        if (aramaKutusuTagName.equals("input")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        if (aramaKutusuName.equals("field-keywords")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        System.out.println("konum :" + aramakutusu.getLocation());
        System.out.println("yükseklik:" + aramakutusu.getSize().height);
        System.out.println(aramakutusu.getDomAttribute("name"));
        System.out.println("css value:" + aramakutusu.getCssValue("name"));
        System.out.println(aramakutusu.isDisplayed());
    }
}
