
package ctrl;

import dao.daoCliente;
import entidades.Cliente;
import java.util.ArrayList;

public class CtrlCliente {
    daoCliente dc= new daoCliente();
    public void agregarCliente(Cliente c) throws Exception{
        dc.insertCliente(c);
    }
    public ArrayList<Cliente>findByBusqueda(int busqueda,String dato) throws Exception{
        return dc.findByBusqueda(busqueda, dato);
    }
    
    public Cliente findByID(String id) throws Exception{
        return dc.getClienteById(id);
    }
    public boolean actualizarCliente(Cliente cli) throws Exception{
        return dc.updateCliente(cli);
    }
}
