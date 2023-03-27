package yasinhoca.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {

    /*
      Browser'ı açıp maximize yapın
      Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
      Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
      Amazon sayfasına geri dönün
      Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine
       eşit olduğunu test edin
      Sayfanın konumunu ve boyutunu yazdırın
      Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
      İstediğiniz şekilde olup olmadığını test edin
      Sayfayı kapatın
       */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
     // Browser'ı açıp maximize yapın
        driver.manage().window().maximize();

     // Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

     //  Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
          driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(3000);

        //  Amazon sayfasına geri dönün
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);


        //Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine
        //  eşit olduğunu test edin

        String expectedUrl = "https://www.amazon.com/";
        System.out.println(expectedUrl);
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);

        if(actualUrl.equals(expectedUrl)){
            System.out.println("Url Test Passed");
        }else{
            System.out.println("Url Test Failed");
        }

        // Sayfanın konumunu ve boyutunu yazdırın
        System.out.println("Sayfanin konumu; " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu; " + driver.manage().window().getSize());

        //  Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(600,600));

        System.out.println("Sayfanin yeni konumu; " + driver.manage().window().getPosition());
        System.out.println("Sayfanin yeni boyutu; " + driver.manage().window().getSize());


        // Istediginiz şekilde olup olmadığını test edin
       Point actualPosition =  driver.manage().window().getPosition();
        //Konum bilgilerini getPosition() methodu ile bir Point container'ı
        //içerisine koyuyoruz.
       if(actualPosition.getX()==100&& actualPosition.getY()==100){
           //x ve y değerlerini Point container'ından alarak karşılaştırıyoruz
           System.out.println("Positon Test Passed");
       }else{
           System.out.println("Positon Test Failed");
       }

        Dimension actualDimension =  driver.manage().window().getSize();
        //Boyut bilgilerini getSize() methodu ile bir Dimension container'ı
        // içerisine koyuyoruz.
        if(actualDimension.getWidth()==600&& actualDimension.getHeight()==600){
            //width(en) ve height(boy) değerlerini Dimension container'ından
            // alarak karşılaştırıyoruz
            System.out.println("Dimension Test Passed");
        }else{
            System.out.println("Dimension Test Failed");
        }

        // Sayfayı kapatın
     driver.quit();

    }
}