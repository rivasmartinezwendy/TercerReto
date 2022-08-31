package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Validar que al ingresar al botón "Tablet", se muestre todos los productos disponibles
 */
public class Segundo {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
        WebElement btnTablets = driver.findElement(By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(4) > a"));
        btnTablets.click();
        Thread.sleep(2000);
        driver.close();
    }
}
