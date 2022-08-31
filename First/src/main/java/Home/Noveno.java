package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Validar que al ingresar al botón "MP3 Player", se muestre todos los productos disponibles
 */
public class Noveno {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
        WebElement btnMP3Player = driver.findElement(By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > a"));
        btnMP3Player.click();
        WebElement opcionlink = driver.findElement(By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > a"));
        opcionlink.click();

        Thread.sleep(2000);
        driver.close();
    }
}
