package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Validar que el titulo de la página de OpenCart, sea "Your Store".
 */
public class Primero {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
        Thread.sleep(3000);
        System.out.println("El titulo de la página es: " + driver.getTitle());
        driver.close();
    }
}
