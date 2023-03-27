package yasinhoca.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Techproeducation sayfasina gidelim
        driver.get("https://www.techproeducation.com");
        Thread.sleep(3000);

        //Sayfanin konumu ve boyutlarini yazdirin.
        System.out.println("Sayfanin konumu; "+
                driver.manage().window().getPosition());

        System.out.println("Sayfanin boyutu; "+
                driver.manage().window().getSize());

        //sayfayi fullscreen boyuta getirelim.
        driver.manage().window().fullscreen();

        System.out.println("Sayfanin fullscreen konumu; "+
                driver.manage().window().getPosition());

        System.out.println("Sayfanin fullscreen boyutu; "+
                driver.manage().window().getSize());

        Thread.sleep(3000);

        //sayfayi max boyuta getirelim.
        driver.manage().window().maximize();

        System.out.println("Sayfanin max konumu; "+
                driver.manage().window().getPosition());

        System.out.println("Sayfanin max boyutu; "+
                driver.manage().window().getSize());

        Thread.sleep(3000);



        //sayfayi min boyuta getirelim.
        driver.manage().window().minimize();

        System.out.println("Sayfanin min  konumu; "+
                driver.manage().window().getPosition());

        System.out.println("Sayfanin  min boyutu; "+
                driver.manage().window().getSize());

        Thread.sleep(3000);



        //driver.quit();
    }
}
