package Registrer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Validar que no permita el ingreso de otro tipo de dato diferente a un numerico en el campo "Telephone"
 */
public class RegistrerQuinto {
    public static void main(String[]args) throws InterruptedException {

        //aqui se declarará los elementos con los que se va a interactuar:
        WebDriver driver = new ChromeDriver();
        WebElement txtTelephone;

        //aqui se ingresa al formulario de Registrer
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
        WebElement btnRegistrer = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
        btnRegistrer.click();
        WebElement btnRegistrer1 = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a"));
        btnRegistrer1.click();

        //aqui se llena el campo:
        txtTelephone = driver.findElement(By.name("telephone"));
        txtTelephone.sendKeys("martinez");

        //aqui la web se congela por tres segundos y luego se cierra la ventana:
        Thread.sleep(3000);
        driver.close();
    }
}
