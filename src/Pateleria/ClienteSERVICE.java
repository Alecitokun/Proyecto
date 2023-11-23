package Pateleria;
import java.util.List;
public class ClienteSERVICE {
        private ClienteDAO clienteDAO;
        public ClienteSERVICE(ClienteDAO clienteDAO) {
            this.clienteDAO = clienteDAO;
        }
        public Cliente obtenerClientePorId(int id) {
            return clienteDAO.obtenerClientePorId(id);
        }
        public List<Cliente> obtenerTodosLosClientes() {
            return clienteDAO.obtenerTodosLosClientes();
        }
        public void agregarCliente(Cliente cliente) {
            clienteDAO.agregarCliente(cliente);
        }
        public void actualizarCliente(Cliente cliente) {
            clienteDAO.actualizarCliente(cliente);
        }
        public void eliminarCliente(int id) {
            clienteDAO.eliminarCliente(id);
        }

}
