import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.List;

/**
 * Esta clase crea un fichero XML con los datos que sacamos de la clase WebScrapping
 */

public class JAXB {

    File file = new File("juegos.xml");
    Juegos juegoslist = new Juegos();
    Juego juego;
    JAXBContext jaxbContext;
    Marshaller jaxbMarshaller;

    /**
     * Este metodo recibe un parametro y lo convierte en XML
     * @param juegos recibe una lista de objetos.
     */
    JAXB(List<Juego> juegos) {
        file.delete();
        try {
            jaxbContext = JAXBContext.newInstance(Juegos.class);

            for (Juego game : juegos) {
                juego = new Juego(game.nombre, game.imagen, game.fecha, game.plataforma, game.descripcion);
                juegoslist.addJuegos(juego);
            }

            jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(juegoslist, file);
//            jaxbMarshaller.marshal(datas, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}