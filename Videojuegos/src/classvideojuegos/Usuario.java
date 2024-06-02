import java.util.Date;

public class Usuario {
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String nombreUsuario;
    private Date fechaRegistro;
    private int edad;

    public Usuario(String nombreC, String direccionC, String telefonoC, String correoC, String nombreUsuarioC, Date fechaRegistroC, int edadC){

        this.nombre = nombreC;
        this.direccion = direccionC;
        this.telefono = telefonoC;
        this.correo = correoC;
        this.nombreUsuario = nombreUsuarioC;
        this.fechaRegistro = fechaRegistroC;
        this.edad = edadC;
    }

    public void actualizarDireccion(String nuevaDireccion){
        this.direccion = "nuevaDireccion";
        System.out.println("Se ha actualizado la direccion del usuario");
    }

    public void actualizarCorreo(String nuevocorreo){
        this.correo = "nuevoCorreo";
        System.out.println("Se ha actualizado el correo del usuario");
    }

    public void actualizarTelefono(String nuevotelefono){
        this.telefono = "nuevo telefono";
        System.out.println("Se ha actualizado el numero de telefono del usuario");
    }

    public void restablecerCuenta(){
        this.nombreUsuario = "Restableciendo";
        System.out.println("La cuenta ha sido restablecida");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
