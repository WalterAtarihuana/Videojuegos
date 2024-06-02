package classvideojuegos;

import java.util.Date;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {

        //Clase1
        Videojuego videojuego = new Videojuego("Mario & Luigi: Paper Jam", new Date(03/12/2015), "AlphaDream", "Aventura", "Nintendo 3DS", 49.90, 4.6);

        videojuego.actualizarPrecio();
        videojuego.actualizarRating();
        videojuego.obtenerInformacion();
        videojuego.esDisponible();

        //Clase 2
        Usuario usuario = new Usuario("Walter Mosquera", "cdla la elsa", "0954789614", "Walter054@gmail.com", "Mosquera2005", new Date(5/8/2022), 18);

        usuario.actualizarDireccion();
        usuario.actualizarCorreo();
        usuario.actualizarTelefono();
        usuario.restablecerCuenta();

        // Clase 3
        Desarrollador desarrollador = new Desarrollador("AlphaDream", "Japón", new Date(12/01/2000), "AD001", "www.alphadream.jp",null , "Tokyo");

        desarrollador.agregarJuego(videojuego);
        desarrollador.actualizarSitioweb();
        desarrollador.actualizarnombre();
        desarrollador.cambiarIdDesarrollador();

    }
}