package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Validar que el sistema no permita ingresar con una contraseña erronea
 */
public class LoginCuarto {
    public static void main(String[]args) throws InterruptedException {

        //aqui se declarará los elementos con los que se va a interactuar:
        WebDriver driver = new ChromeDriver();
        WebElement txtPassword,txtAdress,btnLgn;

        //aqui se ingresa al formulario de Registrer
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
        WebElement btnMyAccount = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
        btnMyAccount.click();
        WebElement btnLogin = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a"));
        btnLogin.click();

        //aqui se llena los datos en algunos campos y se envia el registro llenado:
        txtAdress = driver.findElement(By.name("email"));
        txtAdress.sendKeys("wendyrivas548@gmail.com");

        txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("dthw3a2");

        btnLgn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        btnLgn.click();

        //aqui la web se congela por cuatro segundos y luego se cierra la ventana:
        Thread.sleep(4000);
        driver.close();
    }
}
