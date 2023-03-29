package yasinhoca.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Selenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");

        //System.setProperty java uygulamalarında sistem özelliklerini ayarlamak için kullanılır
        //Bu method ile class'ımıza webdriver'in fiziki yerini belirtiriz
        //Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz

        System.out.println(System.getProperty("webdriver.chrome.driver"));
        //getProperty methodu ile "Key değerini girerek "value"'ya ulaşabilirim

        WebDriver driver = new ChromeDriver();//Boş bir browser açar
        driver.get("https://www.google.com");
        //get() methodu ile adresini belittiğimiz sayfaya gideriz

        driver.quit();
















    }
}
