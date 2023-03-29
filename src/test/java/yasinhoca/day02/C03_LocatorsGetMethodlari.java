package yasinhoca.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatorsGetMethodlari {

  /*
  Amazon sayfasına gidin
  Search bölümünü locate edip, "Tablet" aratalım
  Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
  Sayfayı kapatın
   */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//     Amazon sayfasına gidin
        driver.get("https://www.amazon.com/");

//    Search bölümünü locate edin.
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

//  arama kutusunun tagName'inin input oldugunu test edin
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";
        if (actualTagName.equals(expectedTagName)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

//  arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String actualAttribute = aramaKutusu.getAttribute("name");
        String expectedAttribute = "field-keywords";
        if (actualAttribute.equals(expectedAttribute)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


//   Search bölümünde "Tablet" aratalım.
        aramaKutusu.sendKeys("Tablet");
        aramaKutusu.submit();

//        Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
        WebElement aramaSonucu = driver.findElement(By.className("sg-col-inner"));

        System.out.println("Arama sonucu; " + aramaSonucu.getText());
      //  System.out.println(aramaSonucu); yaparsan sadece hashcode alirsin text demelisin.***


//        Sayfayı kapatın
        driver.quit();


    }
}
