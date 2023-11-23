package Pateleria;
import java.util.List;

public class ProductosService {
    private ProductosDAO productoDAO;
    public ProductosService(ProductosDAO productoDAO) {
        this.productoDAO = productoDAO;
    }
    public Productos obtenerProductoPorId(int id) {
        return productoDAO.obtenerProductosPorId(id);
    }
    public List<Productos> obtenerTodosLosProductos() {
        return productoDAO.obtenerTodosLosProductos();
    }
    public void agregarProducto(Productos productos) {
        productoDAO.agregarProductos(productos);
    }
    public void actualizarProducto(Productos producto) {
        productoDAO.actualizarProductos(producto);
    }
    public void eliminarProducto(int id) {
        productoDAO.eliminarProductos(id);
    }
}



