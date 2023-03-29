package yasinhoca.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElements_Locators {
    /*
  Amazon sayfasına gidin
  Search kutusunu locate edin
  Search kutusunda iphone aratın
  Sayfadaki <input> ve <a> tag'larinin sayısını yazdırın
  Sayfayı kapatınız
  */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


           //    Amazon sayfasına gidin
            driver.get("https://www.amazon.com/");

          //    Search kutusunu locate edin
           WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

          //    Search kutusunda iphone aratın
           aramaKutusu.sendKeys("iphone" + Keys.ENTER);
           //bunu tek cümle ile de yapabilirdik.
        // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

              /*
        Bir WebElement'i locate etmek istersek önce sayfayı açıp element üzerinde sağ
        tıklayıp incele(inspect) seçeneğini tıklıyoruz.Karşımıza çıkan HTML kodlarından
        eşsiz olan locator olarak seçiyoruz. Genellikle "id" attribute'ü eşsiz olarak
        kullanılır.==> driver.findElement(By.id("idDeğeri"));
         */

          //    Sayfadaki <input> ve <a> tag'larinin sayısını yazdırın

        List<WebElement> inputList  = driver.findElements(By.tagName("input"));
        System.out.println("input tag sayisi; " + inputList.size());
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("Link sayisi; " + linkList.size());

        //Linkleri yazdıralım
        for (WebElement w:linkList) {
            System.out.println(w.getText());
        }


          //    Sayfayı kapatınız
          driver.quit();



    }
}
