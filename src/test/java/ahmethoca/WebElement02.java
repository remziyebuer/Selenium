package ahmethoca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement02 {
    public static void main(String[] args) {

        //1-https:www.facebook.com  sayfasina gidin.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https:www.facebook.com");
        //cookies cikarsa kabul et butonuna basin
        driver.
                findElement
                        (By.xpath("//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).
                click();

        //e-mail locate ediniz.
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("ksksksksr@gmail.com");
        //password locate ediniz.
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("5444djdj%");

        //giris yap butonuna basiniz
        driver.findElement(By.xpath("//button[@name='login']")).click();

        //uyari yazisi olarak "The email email you entered isn’t connected to an account.
        // Find your account and log in."mesajinin ciktigini kontrol ediniz
        WebElement uyariYazisi=
                driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedSonuc = "The email you entered isn’t connected to an account." +
                " Find your account and log in.";
        String actualSonuc=uyariYazisi.getText();

        if(expectedSonuc.equals(actualSonuc)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");

        }
        driver.quit();
    }
}
