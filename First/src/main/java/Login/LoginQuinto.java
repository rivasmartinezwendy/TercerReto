package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Validar que al seleccionar la opción "Forgotten Password" ,el usuario pueda
cambiar correctamente el correo electronico y se envíe correctamente el enlace
al nuevi correo
 */
public class LoginQuinto {
    public static void main(String[]args) throws InterruptedException {

        //aqui se declarará los elementos con los que se va a interactuar:
        WebDriver driver = new ChromeDriver();
        WebElement txtPassword,txtAdress,btnLgn,txtNuevoAdress,btnCont;

        //aqui se ingresa al login
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
        WebElement btnMyAccount = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
        btnMyAccount.click();
        WebElement btnLogin = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a"));
        btnLogin.click();
        WebElement opcionlink = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > div:nth-child(2) > a"));
        opcionlink.click();

        //aqui se escribira el correo para que se envie:
        txtNuevoAdress = driver.findElement(By.name("email"));
        txtNuevoAdress.sendKeys("wendyrivas548@gmail.com");

        btnCont = driver.findElement(By.cssSelector("#content > form > div > div.pull-right > input"));
        btnCont.click();


        btnLgn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        btnLgn.click();

        //aqui la web se congela por cuatro segundos y luego se cierra la ventana:
        Thread.sleep(4000);
        driver.close();
    }
}
