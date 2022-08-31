package Registrer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

/*Validar que al enviar el registro (con algunos datos no llenados en los campos obligatorios) y al haber aceptado la politica de privacidad
, el sistema no debe registrarlo exitosamente y se mostrará un comentario debajo de cada campo no llenado indicando que, para que el envío sea exitoso
se debe llenar todos los campos obligatorios
 */
public class RegistrerCuarto {
    public static void main(String[]args) throws InterruptedException {

        //aqui se declarará los elementos con los que se va a interactuar:
        WebDriver driver = new ChromeDriver();
        WebElement txtFirstName,txtLastName,txtPassword,btnContinue,checkBox;

        //aqui se ingresa al formulario de Registrer
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
        WebElement btnRegistrer = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
        btnRegistrer.click();
        WebElement btnRegistrer1 = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a"));
        btnRegistrer1.click();

        //aqui se llena los datos en algunos campos y se envia el registro llenado:
        txtFirstName = driver.findElement(By.name("firstname"));
        txtFirstName.sendKeys("Wendy");
        txtLastName = driver.findElement(By.name("lastname"));
        txtLastName.sendKeys("Rivas");
        txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("wen123");
        checkBox = driver.findElement(By.name("agree"));
        checkBox.click();
        btnContinue = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        btnContinue.click();

        //aqui la web se congela por dos segundos y luego se cierra la ventana:
        Thread.sleep(9000);
        driver.close();
    }
}
