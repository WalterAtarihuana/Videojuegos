package classvideojuegos;

import java.util.Date;

public class Personajes {

    private String nombre;
    private String tipo;
    private int skin;
    private int habilidad;
    private float velocidad;
    private String mision;
    private int objetos;

    public Personajes(String nombreC, String tipoC, int skinC, int habilidadC, float velocidadC, String misionC, int objetosC){

        this.nombre = nombreC;
        this.tipo = tipoC;
        this.skin = skinC;
        this.habilidad = habilidadC;
        this.velocidad = velocidadC;
        this.mision = misionC;
        this.objetos = objetosC;
    }

    public void caminar(){
        this.nombre = "Caminando";
        System.out.println("El personaje ha empezado a caminar");
    }

    public void atacar(){
        this.nombre = "Atacando";
        System.out.println("El persona ha empezado ha atacar al enemigo");
    }

    public void usarItem(){
        this.nombre = "Perdio";
        System.out.println("El personaje ha usado un item");
    }

    public void recogerObjeto(){
        this.nombre = "nuevo objeto";
        System.out.println("El personaje ha obtenido un nuevo objeto");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSkin() {
        return skin;
    }

    public void setSkin(int skin) {
        this.skin = skin;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public int getObjetos() {
        return objetos;
    }

    public void setObjetos(int objetos) {
        this.objetos = objetos;
    }
}
