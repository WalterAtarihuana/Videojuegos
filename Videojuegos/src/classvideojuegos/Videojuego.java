package classvideojuegos;

import java.util.Date;

public class Videojuegos {

    private String titulo;
    private Date fechaLanzamiento;
    private String desarrollador;
    private String genero;
    private String plataforma;
    private double precio;
    private double rating;

    public Videojuegos(String tituloC, Date fechaLanzamientoC, String desarrolladorC, String generoC, String plataformaC, double precioC, double ratingC) {

        this.titulo = tituloC;
        this.fechaLanzamiento = fechaLanzamientoC;
        this.desarrollador = desarrolladorC;
        this.genero = generoC;
        this.plataforma = plataformaC;
        this.precio = precioC;
        this.rating = ratingC;
    }

    public void actualizarPrecio(double nuevoPrecio){
        this.desarrollador = "nuevoPrecio";
        System.out.println("El precio del videojuego ha sido actualizado");
    }

    public void actualizarRating(double nuevoRating){
        this.desarrollador = "Actualizando Rating";
        System.out.println("El rating del videojuego a sido actualizado");

    }

    public void obtenerInformacion(){
        this.desarrollador = "Obteniendo informacion";
        System.out.println("Se ha obtenido informacion del videojuego");

    }

    public void esDisponible(){
        this.desarrollador = "Disponible";
        System.out.println("El videojuego es disponible");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

