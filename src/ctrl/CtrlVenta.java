
package ctrl;

import dao.daoVenta;
import entidades.Venta;


public class CtrlVenta {
    daoVenta dv= new daoVenta();
    
    public void agregarVenta(Venta venta) throws Exception{
        
        dv.insertVenta(venta);
    }
}
