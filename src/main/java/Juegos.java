import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase contiene una lista de la clase Juego
 */

@XmlRootElement(name="Juegos")

public class Juegos {

    List<Juego> juegos = new ArrayList<>();

    /**
     * Aqui cogemos la lista de Videojuegos.
     * @return nos lo devuelve.
     */
    public List<Juego> getJuegos() {
        return juegos;
    }

    /**
     * Aqui asignamos una lista de la clase Juego
     * @param juegos recibe el que asignaremos a la lista
     */
    @XmlElement(name="Juego")
    public void setJuegos(List<Juego> juegos) {
        this.juegos = juegos;
    }

    /**
     * Añade los datos en la lista Juegos
     * @param juego recibe esos datos
     */
    public void addJuegos(Juego juego){
        this.juegos.add(juego);
    }
}
