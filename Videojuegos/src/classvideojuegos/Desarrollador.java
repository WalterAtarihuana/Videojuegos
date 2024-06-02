package classvideojuegos;

import java.util.Date;

public class Desarrollador {

    private String nombre;
    private String pais;
    private Date añoFundacion;
    private String idDesarrollador;
    private String sitioWeb;
    private Date disolucion;
    private String sedeCentral;

    public Desarrollador(String nombreC, String paisC, Date añoFundacionC, String idDesarrolladorC, String sitioWebC, Date disolucionC, String sedeCentralC){

        this.nombre = nombreC;
        this.pais = paisC;
        this.añoFundacion = añoFundacionC;
        this.idDesarrollador = idDesarrolladorC;
        this.sitioWeb = sitioWebC;
        this.disolucion = disolucionC;
        this.sedeCentral = sedeCentralC;
    }

    public void agregarJuego(Videojuego videojuego){
        this.nombre = "Agregando";
        System.out.println("Se ha agregado el videojuego");
    }

    public void actualizarSitioweb(){
        this.sitioWeb = "nuevo sitio web";
        System.out.println("El sitio web del desarrollador ha sido actualizado");
    }

    public void actualizarnombre(){
        this.nombre = "nuevo nombre";
        System.out.println("Se ha actualizado el nombre del desarrollador");
    }

    public void cambiarIdDesarrollador() {
        this.idDesarrollador = "nuevo id del desarrollado";
        System.out.println("El ID del desarrollador ha sido actualizado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getAñoFundacion() {
        return añoFundacion;
    }

    public void setAñoFundacion(Date añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    public String getIdDesarrollador() {
        return idDesarrollador;
    }

    public void setIdDesarrollador(String idDesarrollador) {
        this.idDesarrollador = idDesarrollador;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public Date getDisolucion() {
        return disolucion;
    }

    public void setDisolucion(Date disolucion) {
        this.disolucion = disolucion;
    }

    public String getSedeCentral() {
        return sedeCentral;
    }

    public void setSedeCentral(String sedeCentral) {
        this.sedeCentral = sedeCentral;
    }
}
