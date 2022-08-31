package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Validar que al ingresar al botón "Cameras", se muestre todos los productos disponibles
 */
public class Octavo {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
        WebElement btnCameras = driver.findElement(By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(7) > a"));
        btnCameras.click();

        Thread.sleep(2000);
        driver.close();
    }
}
