package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Validar que al ingresar a la opción "Login", se muestre el formulario para que el usuario pueda ingresar a su cuenta
 */
public class LoginPrimero {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //aqui se ingresa al formulario de Registrer
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
        WebElement btnMyAccount = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
        btnMyAccount.click();
        WebElement btnLogin = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a"));
        btnLogin.click();

        //aqui la web se congela por seis segundos y luego se cierra la ventana:
        Thread.sleep(6000);
        driver.close();
    }
}
