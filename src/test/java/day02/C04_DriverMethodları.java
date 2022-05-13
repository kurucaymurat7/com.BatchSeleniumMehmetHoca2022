package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodları {
    public static void main(String[] args) {
        //Amazon sitesine gidip kaynak kodlarında "spend less" yazdığını test edin.
        System.setProperty("webdriver.chrome.driver","Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        String sayfaKaynakKodlari = driver.getPageSource();
        String arananKelime = "Spend less";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        driver.close();
    }
}
