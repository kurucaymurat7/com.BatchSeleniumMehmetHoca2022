package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {
        //Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //    a. http://a.testaddressbook.com adresine gidiniz.
        //    b. Sign in butonuna basin
        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        //    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!
        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //3. Sayfada kac tane link oldugunu bulun.
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://a.testaddressbook.com");
        WebElement signLink = driver.findElement(By.linkText("Sign in"));
        signLink.click();

        WebElement emailtextBox = driver.findElement(By.id("session_email"));
        WebElement pwdtextBox = driver.findElement(By.name("session[password]"));
        WebElement signinButton = driver.findElement(By.name("commit"));

        emailtextBox.sendKeys("testtechproed@gmail.com");
        pwdtextBox.sendKeys("Test1234!");
        signinButton.click();

        WebElement actualKullaniciAdiWebElement = driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdiWebElement.getText());
        //getText() webElement üzerindeki text'i elde ederiz.
        //driver.close();
        String expecteduserEmail = "testtechproed@gmail.com";
        if (expecteduserEmail.equals(actualKullaniciAdiWebElement.getText())) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

        WebElement addressesElement = driver.findElement(By.linkText("Addresses"));
        WebElement signoutElement = driver.findElement(By.linkText("Sign out"));

        System.out.println("addressesElement:" + addressesElement.isDisplayed());
        System.out.println("signoutElement:" + signoutElement.isDisplayed());

        if (addressesElement.isDisplayed()) {
            System.out.println("adress testi passed");
        } else {
            System.out.println("adress testi failed");
        }

        if (signoutElement.isDisplayed()) {
            System.out.println("signout testi passed");
        } else {
            System.out.println("signout testi failed");
        }

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("linklerin sayisi : " + linklerListesi.size());

        for (WebElement each:linklerListesi) {
            System.out.println(each.getText());
        }
        linklerListesi.stream().forEach(t->System.out.println(t.getText() + " "));

        driver.close();
    }
}
