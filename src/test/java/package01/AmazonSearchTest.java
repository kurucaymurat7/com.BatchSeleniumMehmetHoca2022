package package01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AmazonSearchTest {
    public static void main(String[] args) throws InterruptedException {

        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a.google web sayfasına gidin. https://www. amazon.com/
        //b. Search(ara) “city bike”
        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        //d. “Shopping” e tıklayın.
        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın

        System.setProperty("webdriver.chrome.driver", "Resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));

        driver.get("https://www.google.com");
        driver.navigate().to("https://www.amazon.com");

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        WebElement aramaSonuc = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        String[] sonucTextArrays = aramaSonuc.getText().split(" ");
        System.out.println("İlgili Arama Sonucu : " + sonucTextArrays[sonucTextArrays.length-3]);

        WebElement ilkUrun = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a"));
        ilkUrun.click();

        WebElement sepeteEkleButtonElement = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
        sepeteEkleButtonElement.click();
        driver.close();
    }
}
