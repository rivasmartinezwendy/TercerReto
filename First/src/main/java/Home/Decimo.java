package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Validar que se pueda agregar un producto correctamente al carrito de compras y luego visualizarlo en el listado de pedidos
 */
public class Decimo {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
        WebElement btnAgregarProd = driver.findElement(By.cssSelector("#content > div.row > div:nth-child(2) > div > div.button-group > button:nth-child(1) > span"));
        btnAgregarProd.click();

        Thread.sleep(2000);
        driver.close();
    }
}
