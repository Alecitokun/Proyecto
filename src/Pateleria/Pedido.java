package Pateleria;
import java.math.BigDecimal;
import java.util.Date;
public class Pedido {
    private int id;
    private int idCliente;
    private Date fechaPedido;
    private BigDecimal total;

    public Pedido() {
    }

    // Constructor
    public Pedido(int id, int idCliente, Date fechaPedido, BigDecimal total) {
        this.id = id;
        this.idCliente = idCliente;
        this.fechaPedido = fechaPedido;
        this.total = total;
    }
     // Modificacion y Acceso a Atributos//
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public Date getFechaPedido() {
        return fechaPedido;
    }
    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
