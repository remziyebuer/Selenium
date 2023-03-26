package ahmethoca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElement03 {
    public static void main(String[] args) {

        //https://www.bestbuy.com adresine gidin.
        //cookies cikarsa kabul et butonuna basin
        //sayfada kac adet buton bulundugunu yazdirin
        //sayfa da ki herbir buton üzerinde ki yazilari yazdirin


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //https://www.bestbuy.com adresine gidin.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bestbuy.com ");

        //cookies cikarsa kabul et butonuna basin
        //--cikmadi

        //sayfada kac adet buton bulundugunu yazdirin
        List<WebElement> butonListesi = driver.findElements(By.tagName("button"));
        System.out.println(butonListesi.size());//listenin size'ini aldim

        //sayfa da ki herbir buton üzerinde ki yazilari yazdirin
        for (WebElement w:butonListesi) {
            System.out.println(w.getText());

        }
        driver.quit();
    }

    }

