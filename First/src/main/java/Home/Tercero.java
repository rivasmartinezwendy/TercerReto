package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Validar que al ingresar el nombre de un producto, el buscador pueda buscar correctamente
 */
public class Tercero {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebElement txtProducto,btnSearch;

        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");

        txtProducto = driver.findElement(By.name("search"));
        txtProducto.sendKeys("Tablets");

        btnSearch = driver.findElement(By.cssSelector("#search > span > button"));
        btnSearch.click();

        Thread.sleep(3000);
        driver.close();
    }
}
