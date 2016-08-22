
package ctrl;

import dao.daoCliente;
import entidades.Cliente;

public class CtrlCliente {
    daoCliente dc= new daoCliente();
    public void agregarProducto(Cliente c) throws Exception{
        dc.insertCliente(c);
    }
}
