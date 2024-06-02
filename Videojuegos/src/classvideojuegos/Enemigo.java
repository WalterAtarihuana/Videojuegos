package classvideojuegos;

public class Enemigo {
    private String nombre;
    private String tipo;
    private int nivel;
    private int salud;
    private int ataque;
    private int defensa;
    private int experienciaOtorgada;

    public Enemigo(String nombreC, String tipoC, int nivelC, int saludC, int ataqueC, int defensaC, int experienciaOtrogadaC){

        this.nombre = nombreC;
        this.tipo = tipoC;
        this.nivel = nivelC;
        this.salud = saludC;
        this.ataque = ataqueC;
        this.defensa = defensaC;
        this.experienciaOtorgada = experienciaOtrogadaC;
    }

    public void atacar(){
        this.nombre = "Atacando";
        System.out.println("El enemigo esta atacando");
    }

    public void esquivar(){
        this.nombre = "Esquivando";
        System.out.println("Ha intentado esquivar el ataque");
    }

    public void daño(){
        this.nombre = "Herido";
        System.out.println("Ha recibido daño");
    }

    public void nivel(){
        this.nombre = "Experiencia";
        System.out.println("Ha subido de nivel");
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getExperienciaOtorgada() {
        return experienciaOtorgada;
    }

    public void setExperienciaOtorgada(int experienciaOtorgada) {
        this.experienciaOtorgada = experienciaOtorgada;
    }

}
