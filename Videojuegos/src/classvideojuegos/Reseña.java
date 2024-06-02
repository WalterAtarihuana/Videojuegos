package classvideojuegos;

import java.util.Date;

public class Reseña {

    private String usuario;
    private String videojuego;
    private String comentario;
    private int likes;
    private Date fechaReseña;
    private String idReseña;
    private int reportes;

    public Reseña(String usuarioC, String videojuegoC, String comentarioC, int likesC, Date fechaReseñaC, String idReseñaC, int reportesC){

        this.usuario = usuarioC;
        this.videojuego = videojuegoC;
        this.comentario = comentarioC;
        this.likes = likesC;
        this.fechaReseña = fechaReseñaC;
        this.idReseña = idReseñaC;
        this.reportes = reportesC;
    }

    public void eliminarReseña(Usuario usuario){
        this.usuario = "no hay reseña";
        System.out.println("El usuario ha eliminado la reseña");
    }

    public void marcacomoDestacada(){
        this.comentario = "Destacado";
        System.out.println("El usuario ha marcado el comentario como destacado");
    }

    public void añadirRespuesta(){
        this.comentario = "nueva respuesta";
        System.out.println("Respuesta añadida");
    }

    public void reportarReseña(){
        this.comentario = "Reportado";
        System.out.println("La reseña ha sido reportada");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(String videojuego) {
        this.videojuego = videojuego;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getFechaReseña() {
        return fechaReseña;
    }

    public void setFechaReseña(Date fechaReseña) {
        this.fechaReseña = fechaReseña;
    }

    public String getIdReseña() {
        return idReseña;
    }

    public void setIdReseña(String idReseña) {
        this.idReseña = idReseña;
    }

    public int getReportes() {
        return reportes;
    }

    public void setReportes(int reportes) {
        this.reportes = reportes;
    }
}
