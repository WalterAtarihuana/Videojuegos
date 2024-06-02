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


        //Clase 4
        Personajes personajes = new Personajes("Mario", "Humano", 0, 0, 4, "Rescate", 5);

        personajes.caminar();
        personajes.atacar();
        personajes.usarItem();
        personajes.recogerObjeto();


        //Clase 5
        Enemigo enemigo = new Enemigo("Bowser", "Tortuga",50, 2000, 150, 200, 1000000);

        enemigo.atacarPersonaje();
        enemigo.esquivar();
        enemigo.recibirDaño();
        enemigo.nivel();


        //Clase 6
        Nivel nivel = new Nivel(1, "Dificil", "Aventura", "100 monedas", "Bosque", 30, 40);

        nivel.iniciarnivel();
        nivel.finalizarnivel();
        nivel.obtenerInformacion();
        nivel.establecerTiempoLimite();


        //Clase 7
        Item item = new Item("Espada Legendaria", "Arma", "Epico", 1, 5.0, 500, true);

        item.equiparItem();
        item.venderItem();
        item.eliminarItem();
        item.mejorar();

    }
}