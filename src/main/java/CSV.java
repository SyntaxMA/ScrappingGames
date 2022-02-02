import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Esta clase crea una fichero CSV con los datos que obtenemos de la clase WebScrapping
 */
public class CSV {

    /**
     *
     * @param listajuegos recibe una lista de objetos.
     * @param file es el ficherop donde vamos a escribir los datos.
     */

    CSV(List<Juego> listajuegos, File file){
        CSVWriter csvWriter;
        String[] entries =  new String[4];
        file.delete();
        for (Juego juego: listajuegos) {
            entries[0]=(juego.nombre);
            entries[1]=(juego.imagen);
            entries[2]=(juego.fecha);
            entries[3]=(juego.plataforma);
            entries[4]=(juego.descripcion);

            try {
                csvWriter = new CSVWriter(new FileWriter(file, true));
                csvWriter.writeNext(entries);
                csvWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ruta del archivo " + file.getPath());
    }
}
