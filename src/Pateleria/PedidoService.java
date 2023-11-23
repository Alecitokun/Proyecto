package Pateleria;
import java.util.List;
public class PedidoService {
    private PedidoDAO pedidoDAO;
    public PedidoService(PedidoDAO pedidoDAO) {
        this.pedidoDAO = pedidoDAO;
    }
    public Pedido obtenerPedidoPorId(int id) {
        return pedidoDAO.obtenerPedidoPorId(id);
    }
    public List<Pedido> obtenerTodosLosPedidos() {
        return pedidoDAO.obtenerTodosLosPedidos();
    }
    public void agregarPedido(Pedido pedido) {
        pedidoDAO.agregarPedido(pedido);
    }
    public void actualizarPedido(Pedido pedido) {
        pedidoDAO.actualizarPedido(pedido);
    }
    public void eliminarPedido(int id) {
        pedidoDAO.eliminarPedido(id);
    }
}

