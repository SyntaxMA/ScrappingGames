
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Esta clase contiene unas variables ue utilizaremos para añadirlos al XML.
 */

@XmlRootElement(name = "Funko")

public class Juego {

    String nombre;
    String imagen;
    String fecha;
    String plataforma;
    String descripcion;

    /**
     * Este constructor que recibira unos datos y los asignara
     * @param nombre recibe un valor para titulo
     * @param imagen recibe un valor para imagen
     * @param fecha recibe un valor para fecha
     * @param plataforma recibe un valor para plataforma
     * @param descripcion recibe un valor para descripcion
     */
    Juego(String nombre, String imagen, String fecha, String plataforma,String descripcion) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.fecha = fecha;
        this.plataforma = plataforma;
        this.descripcion = descripcion;
    }

    /**
     * Este es un constructor ue esta vacio
     */
    Juego(){}

    // --------------> NOMBRE DEL JUEGO <---------------
    /**
     * Aqui cogemos el titulo
     * @param titulo nos devuelve el titulo
     */
    @XmlElement(name = "Nombre")
    public void setName(String titulo) {
        this.nombre = titulo;
    }
    /**
     * Sirve para asignar el valor de titulo
     * @return nos devuelve el valor de titulo
     */
    public String getNombre() {
        return nombre;
    }

    // --------------> IMAGEN DEL JUEGO <---------------
    /**
     * Aqui cogemos la imagen
     * @param imagen nos devuelve la imagen
     */
    @XmlElement(name = "Imagen")
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    /**
     * Sirve para asignar el valor de imagen
     * @return nos devuelve el valor de imagen
     */
    public String getImagen() {
        return imagen;
    }

    // --------------> FECHA DEL JUEGO <---------------
    /**
     * Aqui cogemos la fecha
     * @param fecha nos devuelve la fecha
     */
    @XmlElement(name = "Fecha")
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Sirve para asignar el valor de la fecha
     * @return nos devuelve el valor de la fecha
     */
    public String getFecha() {
        return fecha;
    }

    // --------------> PLATAFORMA DEL JUEGO <---------------
    /**
     * Aqui cogemos la plataforma del juego
     * @param plataforma nos devuelve la plataforma del juego
     */
    @XmlElement(name = "Plataforma")
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    /**
     * Sirve para asignar el valor de precio
     * @return nos devuelve el valor de precio
     */
    public String getPlataforma() {
        return plataforma;
    }

    // --------------> DESCRIPCION DEL JUEGO <---------------
    /**
     * Aqui cogemosd el descripcion
     * @param descripcion nos devuelve la descripcion
     */
    @XmlElement(name = "Descripcion")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Sirve para asignar el valor de descripcion
     * @return nos devuelve el valor de descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
}
