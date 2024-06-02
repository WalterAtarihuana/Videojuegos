import java.util.Date;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Videojuegos videojuegos = new Videojuegos("Mario & Luigi: Paper Jam", new Date(03/12/2015), "AlphaDream", "Aventura", "Nintendo 3DS", 49.90, 4.6);

        videojuegos.actualizarPrecio(50);
        videojuegos.actualizarRating(4.5);
        videojuegos.obtenerInformacion();
        videojuegos.esDisponible();

        Usuario usuario = new Usuario("Walter Mosquera", "cdla la elsa", "0954789614", "Walter054@gmail.com", "Mosquera2005", new Date(5/8/2022), 18);
        usuario.actualizarDireccion("Duran");
        usuario.actualizarCorreo("Ismael18@gmail.com");
        usuario.actualizarTelefono("0981014789");
        usuario.restablecerCuenta();
    }
}