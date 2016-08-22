package ctrl;

import entidades.Producto;
import dao.daoProducto;
import java.util.ArrayList;


public class CtrlProducto {
    
    daoProducto dp= new daoProducto();
    
    public void agregarProducto(Producto p) throws Exception{
        dp.insertProducto(p);
        
    }
    public ArrayList<Producto>  buscarPorNombre(String nombre ) throws Exception{
        return dp.findByNombreProducto(nombre);
    }
    
}
