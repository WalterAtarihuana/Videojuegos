package classvideojuegos;

public class Nivel {

    private int numero;
    private String dificultad;
    private String descripcion;
    private String recompensa;
    private String ambiente;
    private int puntos;
    private int tiempoLimite;

    public Nivel(int numeroC, String dificultadC, String descripcionC, String recompensaC, String ambienteC, int puntosC, int tiempoLimiteC){

        this.numero = numeroC;
        this.dificultad = dificultadC;
        this.descripcion = descripcionC;
        this.recompensa = recompensaC;
        this.ambiente = ambienteC;
        this.puntos = puntosC;
        this.tiempoLimite = tiempoLimiteC;
    }

    public void iniciarnivel(){
        this.dificultad = "Empezando";
        System.out.println("Iniciando nivel");
    }

    public void finalizarnivel(){
        this.dificultad = "Finalizado";
        System.out.println("Nivel completado");
    }

    public void obtenerInformacion(){
        this.dificultad = "nueva informacion";
        System.out.println("Informacion del nivel");
    }

    public void establecerTiempoLimite(){
        this.dificultad = "nuevo tiempo";
        System.out.println("Tiempo limite establecido");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getTiempoLimite() {
        return tiempoLimite;
    }

    public void setTiempoLimite(int tiempoLimite) {
        this.tiempoLimite = tiempoLimite;
    }
}
