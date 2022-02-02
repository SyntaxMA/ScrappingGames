import java.io.*;
import java.util.Scanner;

/**
 * Esta clase creada básicamente para ser la encargada en hacer el run y hacer los preparativos de los documentos XML y CSV.
 */

public class Main {
  static Scanner scan = new Scanner(System.in);

  /**
   * Clase principal del webscrapping
   * @param args recoge los argumentos intoducidos, no se usa en esta aplicación
   */

  public static void main(String[] args) {
    File csvFile = new File("src/documents/videojuegos.csv");
    File xmlFile = new File("src/documents/videojuegos.xml");

    App app = new App(csvFile, xmlFile);
    app.run();
  }
}
