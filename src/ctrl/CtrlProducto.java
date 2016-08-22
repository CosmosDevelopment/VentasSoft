package ctrl;

import entidades.Producto;
import dao.daoProducto;


public class CtrlProducto {
    
    daoProducto dp= new daoProducto();
    public void agregarProducto(Producto p) throws Exception{
        dp.insertProducto(p);
    }
    
}
