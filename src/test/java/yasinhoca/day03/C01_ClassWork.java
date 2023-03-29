package yasinhoca.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C01_ClassWork {
    /*
        https://www.amazon.com/ sayfasına gidin.
        “city bike” araması yapın
        Arama sonuç metnini yazdırın
        Sonuç sayısını yazdırın
        Sonuc sayısını LAMBDA ile yazdırın
        Çıkan ilk sonucun resmine tıklayın.
        Sayfayı kapatın
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");

//        “city bike” araması yapın
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

//        Arama sonuç metnini yazdırın
     List<WebElement> aramaSonucListi = driver.
             findElements(By.className("sg-col-inner"));
     //Tüm "sg-col-inner"
     System.out.println("aramaSonuc = " + aramaSonucListi.get(0).getText());
     //listin ilk elemanini alarak degerini yazdiriyorum.

//        Sonuç sayısını yazdırın
        String sonucSayisi = aramaSonucListi.get(0).getText().split(" ")[2];
        System.out.println("sonucSayisi = " + sonucSayisi);

//        Sonuc sayısını LAMBDA ile yazdırın
        Arrays.stream(aramaSonucListi.get(0).getText().split(" ")).
                skip(2).limit(1).forEach(System.out::println);

//        Çıkan ilk sonucun resmine tıklayın.
        List<WebElement> urunResimleri = driver.findElements(By.className("s-image"));
        urunResimleri.get(0).click();

        /*Erol hoca nin cözümü
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> sonuclar = driver.findElements(By.xpath("//h2//a"));
        sonuclar.get(0).click();
         */

//        Sayfayı kapatın
         driver.quit();

    }
}
