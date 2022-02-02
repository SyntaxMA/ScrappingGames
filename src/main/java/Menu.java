/**
 * Esta clase creada como otro extra de la clase SO, esta hará la que haga del menu y haga mas de visual de la clase SO.
 */

public class Menu {
    /**
     * Este metodo sirve para crear las opciones del menu.
     * @param opciones le paso un arraylist con las opciones a mostrar.
     * @return Retorna lo que haya escrito el usuario.
     */
    String elegirOpcion(String[] opciones){

        boolean seguirPidiendo = true;
        String opcion = " ";


        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i]);
        }
        while(seguirPidiendo) {
            System.out.println("\nOpcion:");
            opcion = Main.scan.nextLine();

            try {
                if (Integer.parseInt(opcion) > opciones.length) {
                    System.out.println("\033[31m" + "Esa opcion no existe" + "\033[0m");
                } else {
                    seguirPidiendo = false;
                }
            } catch (Exception e) {
                System.out.println("¡Introduzca una opcion!");
                seguirPidiendo = true;
            }
        }
        return opcion;
    }
}