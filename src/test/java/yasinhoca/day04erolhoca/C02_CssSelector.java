package yasinhoca.day04erolhoca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelector {

    //https://the-internet.herokuapp.com/add_remove_elements/adresine gidiniz
    //Add Element butonuna basin
    //Delete butonu'nun görünür oldugunu test edin
    //Delete tusuna basin
    //"Add/Remove Elements" yazisinin gorunur oldugunu test edin

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);

        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        Thread.sleep(3000);

        //Delete butonu'nun görünür oldugunu test edin
        WebElement deletebutton =driver.
                findElement(By.cssSelector("button[onclick='deleteElement()']"));
        System.out.println("Görünüyor mu? ; " +  deletebutton.isDisplayed());
        System.out.println("Erisiliyor mu? ; " +  deletebutton.isEnabled());
        System.out.println("Seciliyor mu? ; " +  deletebutton.isSelected());

        //Delete tusuna basin
        deletebutton.click();
        Thread.sleep(2000);

        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement element = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        //bunu css ile driver.findElement(By.cssSelector("h3") ama bir tane oldugunu kontrol etmeliyim.
        //css de texti alamadim cün ki css metin ile calismaz.
        //xpath daha fazla kombinasyona sahiptir ve indexe göre arama yapabilir
        //cssSelector indexe göre arama yapamaz ancak daha hizli calisir

        System.out.println(element.getText());
        System.out.println(element.isDisplayed());

        driver.quit();


    }
}
