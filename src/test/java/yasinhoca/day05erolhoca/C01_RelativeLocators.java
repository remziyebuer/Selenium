package yasinhoca.day05erolhoca;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {

    /*
      RELATIVE LOCATOR
          - Bir web sayfasında benzer özelliklere sahip webelementlerin olduğu durumlarda
          kullanılabilir.Eger locate edemezsem bunu tercih ederim
          - above --> Belirtilen elementin üstünde olan elementi seçer
          - below --> Belirtilen elementin altında olan elementi seçer
          - to_left_of --> Belirtilen elementin solunda olan elementi seçer
          - to_right_of --> Belirtilen elementin sağında olan elementi seçer
          - near --> Belirtilen elementin yanında/yakınında olan elementi seçer
       */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);

        //Relative Locator kullanarak hybrid bike altındaki webelemente tıklayalım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement roadBikes = driver.findElement(with(By.tagName("a")).below(hybridBike));
        roadBikes.click();




    }
}
