package Pateleria;

import java.util.List;

public interface PedidoDAO {
    Pedido obtenerPedidoPorId(int id);
    List<Pedido> obtenerTodosLosPedidos();
    void agregarPedido(Pedido pedido);
    void actualizarPedido(Pedido pedido);
    void eliminarPedido(int id);

}
