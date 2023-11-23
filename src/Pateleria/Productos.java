package Pateleria;
import java.math.BigDecimal;
public class Productos {
    public Productos(int i, String pastelDeChocolate, String deliciosoPastelDeChocolate, BigDecimal bigDecimal) {
    }

    public String getId() {
        return null;
    }

    public String getNombre() {
    return null;
    }

    public String getDescripcion() {
        return null;
    }
    public String getPrecio(){
        return null;
    }

    public class Producto {
        private int id;
        private String nombre;
        private String descripcion;
        private BigDecimal precio;

        public Producto() {
        }

        // Constructor
        public Producto(int id, String nombre, String descripcion, BigDecimal precio) {
            this.id = id;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
        }
        //Acceso y Modificaccion de Atributos//
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getDescripcion() {
            return descripcion;
        }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        public BigDecimal getPrecio() {
            return precio;
        }
        public void setPrecio(BigDecimal precio) {
            this.precio = precio;
        }
    }
}
