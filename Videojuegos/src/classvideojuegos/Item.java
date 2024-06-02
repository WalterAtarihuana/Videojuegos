package classvideojuegos;

public class Item {

        private String nombre;
        private String tipo;
        private String rareza;
        private int cantidad;
        private double peso;
        private double valor;
        private boolean esEquipable;

        public Item(String nombreC, String tipoC, String rarezaC, int cantidadC, double pesoC, double valorC, boolean esEquipableC){

                this.nombre = nombreC;
                this.tipo = tipoC;
                this.rareza = rarezaC;
                this.cantidad = cantidadC;
                this.peso = pesoC;
                this.valor = valorC;
                this.esEquipable = esEquipableC;
        }

        public void equiparItem() {
                if (!this.esEquipable) {
                        System.out.println("Equipando el item");
                } else {
                        System.out.println("Este item no es equipable.");
                }
        }

        public void venderItem() {
                this.rareza = "Mas monedas";
                System.out.println("Vendiendo el item por monedas.");
        }

        public void eliminarItem() {
                this.rareza = "Eliminando";
                System.out.println("Eliminando el item: " + nombre);
        }

        public void mejorar() {
                this.rareza = "Incremento";
                System.out.println("Mejorando el item");
                valor = 1.2;
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

        public String getRareza() {
                return rareza;
        }

        public void setRareza(String rareza) {
                this.rareza = rareza;
        }

        public int getCantidad() {
                return cantidad;
        }

        public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
        }

        public double getPeso() {
                return peso;
        }

        public void setPeso(double peso) {
                this.peso = peso;
        }

        public double getValor() {
                return valor;
        }

        public void setValor(double valor) {
                this.valor = valor;
        }

        public boolean isEsEquipable() {
                return esEquipable;
        }

        public void setEsEquipable(boolean esEquipable) {
                this.esEquipable = esEquipable;
        }
}
