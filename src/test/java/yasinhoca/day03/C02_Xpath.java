package yasinhoca.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //soru; 20 ic tekerlek olani tiklayiniz
        //driver.findElement(By.xpath("//span[.='20 Inch']")).click();
      //burdaki 20 inc text idi.



        //bisiklet fiyati 200 ile 500$ arasinda olanlari tiklayiniz.
        driver.findElement(By.xpath("//span[.='$200 to $500']")).click();
    }
}
