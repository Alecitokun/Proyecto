package Pateleria;

import java.util.List;

public interface ClienteDAO {
 Cliente obtenerClientePorId( int id);
 List<Cliente> obtenerTodosLosClientes();
 void agregarCliente(Cliente cliente);
 void actualizarCliente(Cliente cliente);
 void eliminarCliente(int id);

}




