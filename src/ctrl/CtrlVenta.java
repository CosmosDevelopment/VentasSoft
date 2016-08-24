
package ctrl;

import dao.daoVenta;
import entidades.Venta;
import java.util.ArrayList;


public class CtrlVenta {
    daoVenta dv= new daoVenta();
    
    public void agregarVenta(Venta venta) throws Exception{
        
        dv.insertVenta(venta);
    }
    public ArrayList<Venta> listByCliente(int idCliente) throws Exception{
        ArrayList<Venta> listaVenta= new ArrayList<Venta>();
        if(dv.getVentasByIdCliente(idCliente).size()>0){
            listaVenta=dv.getVentasByIdCliente(idCliente);
        }
        
        return listaVenta;
    }
}
