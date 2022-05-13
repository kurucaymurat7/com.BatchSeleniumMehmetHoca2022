package day04_xpath_cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
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

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //çıkan bütün elemanları listeye alıp ilk elemana tıkladık.
        List<WebElement> istenenWebElementList = driver.findElements(By.className("sg-col-inner"));
        WebElement istenenWebElement = istenenWebElementList.get(0);
        System.out.println(istenenWebElement.getText());

        //çıkan bütün elemanları listeye alıp ilk elemana tıkladık.
        List<WebElement> urunResimleriList = driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi = urunResimleriList.get(0);
        ilkUrunResmi.click();
        Thread.sleep(2000);
        driver.close();
    }
}
