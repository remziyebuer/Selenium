package yasinhoca.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//Bos bir browser actik

        driver.get("https://www.google.com");//Gitmek istedigimiz sayfayi belirtiyoruz
        //gitmek istedigimiz sayfaya gider.
        System.out.println("Sayfanin Basligi; " + driver.getTitle());
        //String dönderdigi icin sout'a koyariz
        System.out.println("Sayfanin Adresi; " + driver.getCurrentUrl());
        //String dönderdigi icin sout'a koyariz
        // System.out.println("Sayfanin Kaynak Kodlari; " + driver.getPageSource());
        System.out.println("Sayfaya ait hash degeri ; " + driver.getWindowHandle());
        //Sayfanin (window) hash degerini getirir.Bu hash degeri ile baska sayfadan bu sayfaya
        // direkt dönebilmeyi saglar.(Sayfalar arasi gecis.)

        driver.quit();
    }
}
