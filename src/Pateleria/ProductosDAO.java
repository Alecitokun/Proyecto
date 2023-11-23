package Pateleria;

import java.util.List;

public interface ProductosDAO {
    Productos obtenerProductosPorId(int id);
    List<Productos> obtenerTodosLosProductos();
    void agregarProductos(Productos productos);
    void actualizarProductos(Productos productos);
    void eliminarProductos(int id);

}
