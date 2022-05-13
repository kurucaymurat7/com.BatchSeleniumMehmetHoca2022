package package01;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class trendyol {
    public static void main(String[] args) throws InterruptedException {
        // google'a git
        // trendyolu ara
        // trendyol linkini bulup siteye git
        // avize arat
        // toplam ürün sayısını al
        // yeni sekmede morhipoya git
        // avize arat
        // toplam ürün sayısını al
        // iki sitedeki topla avize sayısını karşılaştır
        // ürün sayısı fazla olan siteyi kapat

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // google'a git
        driver.get("https://google.com");

        // trendyolu ara
        driver.findElement(By.name("q")).sendKeys("trendyol" + Keys.ENTER);

        // trendyol linkini bulup siteye git
        driver.findElement(By.partialLinkText("trendyol")).click();

        // avize arat
        driver.findElement(By.cssSelector(".search-box")).sendKeys("avize"+ Keys.ENTER);

        // toplam ürün sayısını al
        String urunSayisiStr = driver.findElement(By.xpath("//div[@class='dscrptn']")).getText().replaceAll("\\D","");
        int trendyolToplam = Integer.parseInt(urunSayisiStr);
        System.out.println("trendyol toplam urun : "+ trendyolToplam);

        // yeni sekmede morhipoya git
        driver.switchTo().newWindow(WindowType.TAB).get("https://morhipo.com");

        // avize arat
        driver.findElement(By.name("q")).sendKeys("avize"+ Keys.ENTER);
        // toplam ürün sayısını al
        String mUrunSayisiStr = driver.findElement(By.cssSelector("#total-product-count")).getText();
        int morhipoToplam = Integer.parseInt(mUrunSayisiStr);
        System.out.println("morhipo toplam urun : "+morhipoToplam);


        // iki sitedeki topla avize sayısını karşılaştır
        // ürün sayısı fazla olan siteyi kapat

        List<String> sekmeler = new ArrayList<>(driver.getWindowHandles());

        System.out.println(sekmeler);

        if (morhipoToplam<trendyolToplam){
            Thread.sleep(2000);
            driver.close();
        }
        else{
            Thread.sleep(2000);
            driver.switchTo().window(sekmeler.get(0));
            Thread.sleep(2000);
            driver.close();
        }

    }
}
