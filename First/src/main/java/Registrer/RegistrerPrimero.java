package Registrer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Validar que al ingresar a la opción "My Account", se muestre el formulario para registrar a un usuario
 */
public class RegistrerPrimero {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //aqui se ingresa al formulario de Registrer
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
        WebElement btnRegistrer = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
        btnRegistrer.click();
        WebElement btnRegistrer1 = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a"));
        btnRegistrer1.click();

        //aqui la web se congela por dos segundos y luego se cierra la ventana:
        Thread.sleep(2000);
        driver.close();
    }
}
