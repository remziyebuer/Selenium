package yasinhoca.day04erolhoca;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class C01_Xpath {

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

        //tag_name[@attributeName='atributeDeğeri']
        //input[@id='twotabsearchtextbox']

//        “city bike” araması yapın
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);


//Soru; Hybrid Bikes bölümüne tiklayiniz  ve görünür olup olmadığını,
// erişilebilir olup olmadığını ve seçilebilir olup olmadığını konsolda gösteriniz

        //        <span class="a-size-base a-color-base">hybrid bike</span>-->html kodu

//  1.yol;      driver.findElement(By.
//                xpath("(//*[@class='a-size-base a-color-base'])[11]")).click();
//        --> Bu şekilde index kullanarak uniqe olarak WE ulaşabiliriz

//2.yol
  WebElement hybridBike =   driver.
              findElement(By.xpath("//* [text()='Hybrid Bikes']"));
        System.out.println(hybridBike.isDisplayed());//WE görüntüleniyormu ? -->Görüntülenebiliyor True
        System.out.println(hybridBike.isEnabled());//WE erişilebiliyormu ? --> Erişilebiliyor True
        System.out.println(hybridBike.isSelected());//WE seçilebiliyormu ? --> Seçilemiyor False
        hybridBike.click();


 // --> xpath ile locate alırken html kodlarında attribute name olmayan <tagname class=değeri>text()
//        metin varsa bu şekilde locate edebiliriz.text sadece xpath e ait css de yoktur.text yerine
//        noktada konur ama bazen hataverir ama bu sekil garantidir.

//        Arama sonuç metnini yazdırın

 //(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1] --> 15 results for "city bike"
//        bunu da yazdirabilirsiniz tam metin olarak bir üstteki html kodda.

       WebElement sonucSayisi =  driver.findElement(By.xpath("//*[text()='15 results for']"));
        System.out.println(sonucSayisi.getText());
       //illa aldigimiz locate calismayabilir baska locate almam gerekebilir bunu manuel kontrol etmeliyim

//        Sonuç sayısını yazdırın
        String [] sonuc = sonucSayisi.getText().split(" ");
        System.out.println(sonuc[0]);

//        Çıkan ilk sonucun resmine tıklayın.
    //bu sefer bu sekilde farkli bir xpath ile almak istedim.
        driver.findElement(By.xpath("(//*[@class='a-link-normal s-no-outline'])[1]")).click();

//        Sayfayı kapatın
        driver.quit();






    }
}
