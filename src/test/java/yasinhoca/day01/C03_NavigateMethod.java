package yasinhoca.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim
        //driver.get("https://www.amazon.com");
        //bunu navigate ilede yapabiliriz
        // Navigate sayesinde sayfalar arasi hareket edebiliriiz
        driver.navigate().to("https://amazon.com");

        Thread.sleep(3000);

        //techproeducation sayfasina gidiniz.
       // driver.get("https://techproeducation.com");
        driver.navigate().to("https://techproeducation.com");

        Thread.sleep(3000);

        //Amazon sayfasina geri dönelim.
        driver.navigate().back();
        Thread.sleep(3000);

        //Techproya geri dönelim.
        driver.navigate().forward();
        Thread.sleep(3000);

        //Sayfayi yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);



        driver.quit();
    }

    }
