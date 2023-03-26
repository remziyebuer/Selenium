package ahmethoca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class WebElement01 {


    public static void main(String[] args) {
        //1-https:www.amazon.com  sayfasina gidin.
        //2-arama cubuguna nutella yazdirin.
        //3-nutella yazdiktan sonra Enter' abasarak arama islemi yapin
        //4-bulunan sonuclari yazdirin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1-https:www.amazon.com  sayfasina gidin.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https:www.amazon.com");
        //2-arama cubuguna nutella yazdirin.

        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("nutella");

        //3-nutella yazdiktan sonra Enter' abasarak arama islemi yapin
        aramakutusu.submit();

        //4-bulunan sonuclari yazdirin
        WebElement sonucYazi= driver.findElement
                (By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        System.out.println("sonuc yazisi; " + sonucYazi.getText());




    }
}
