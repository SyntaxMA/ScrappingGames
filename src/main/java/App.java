import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase App, es la clase encargada donde se va a ejecutar la mayoria del código.
 */

public class App implements Runnable {

    // Declaracion de clases
    SO so = new SO();

    File csvFile;
    File xmlFile;
    CSV csv;
    JAXB jaxb;

    /**
     * Este es el constructor que utilizaremos para los archivos CSV y XML.
     *
     * @param csvFile el archivo csv declarado en la clase main
     * @param xmlFile el archivo xml declarado en la clase main
     */

    public App(File csvFile, File xmlFile) {
        this.csvFile = csvFile;
        this.xmlFile = xmlFile;
    }

    /**
     * Run de la clase App, es donde se encuentra el codigo
     */

    @Override
    public void run() {

        // Permite elegir el sistema operativo, por lo que proporciona compatibilidad tanto con Windows como con Ubuntu
        System.out.println("Elige el Sistema Operativo que estas utilizando:");
        WebDriver driver = so.elegirSO();

        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv("HOME"));

        //Declaración de elementos que seran usados como base del websrapping

        List<WebElement> juegoElements = driver.findElements(new By.ByClassName("table transparente tablasinbordes"));
        List<Juego> juegos = new ArrayList();

        String nombre;
        String imagen;
        String fecha;
        String plataformas;
        String descripcion;


        for (WebElement juegoElement : juegoElements) {

            try {

                nombre = juegoElement.findElement(new By.ByClassName("s_title_block")).getText();
                imagen = juegoElement.findElement(new By.ByClassName("mb05 imgabsoluta")).getAttribute("src");
                fecha = juegoElement.findElement(new By.ByClassName("price")).getText();
                plataformas = juegoElement.findElement(new By.ByClassName("color83")).getText();
                descripcion = juegoElement.findElement(new By.ByClassName("product-desc")).getText();


                System.out.println(nombre);
                System.out.println(imagen);
                System.out.println(fecha);
                System.out.println(plataformas);
                System.out.println(descripcion + "\n");


                Juego juego = new Juego();
                juego.setName(nombre);
                juego.setImagen(imagen);
                juego.setFecha(fecha);
                juego.setPlataforma(plataformas);
                juego.setDescripcion(descripcion);
                juegos.add(juego);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //Crea los documentos csv y xml
        csv = new CSV(juegos, csvFile);
        jaxb = new JAXB(juegos);
        driver.close();

    }
}
