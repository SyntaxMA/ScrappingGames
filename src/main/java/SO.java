import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.awt.*;

/**
 * Esta es la clase SO, es la clase extra creada para hacer la elección sobre que sistema operativo tiene el usuario y que gecko driver usar.
 */

public class SO {

    /**
     * Con el metodo permitimos al usuario elegir el sistema operativo desde el que trabajas para ejecutar el Gecko correspondiente.
     * @return Devuelve el Webdriver con la info del geckodriver que ha elegido el usuario.
     */

    public WebDriver elegirSO(){
        Menu menu = new Menu();
        WebDriver driver = null;
        String[] opcionesSO = {"Sistema Windows (Gecko.exe)", "Sistema Linux (Gecko)"};
        String opcionSO = menu.elegirOpcion(opcionesSO);


        if ("1".equals(opcionSO)){
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
            driver.get("https://vandal.elespanol.com/lanzamientos/0/videojuegos");


        } else if ("2".equals(opcionSO)){
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
            driver.get("https://vandal.elespanol.com/lanzamientos/0/videojuegos");
        }
        return driver;
    }
}
