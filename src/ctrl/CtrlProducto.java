package ctrl;

import entidades.Producto;
import dao.daoProducto;
import java.util.ArrayList;


public class CtrlProducto {
    
    daoProducto dp= new daoProducto();
    
    public void agregarProducto(Producto p) throws Exception{
        p.setEstadoProducto(true);
        dp.insertProducto(p);
        
    }
    public void actualizarProducto(Producto p) throws Exception{
        
        dp.updateProducto(p);
        
    }
    public ArrayList<Producto>  buscarPorNombre(String nombre ) throws Exception{
        return dp.findByNombreProducto(nombre);
    }
    public Producto  buscarPorNombreExacto(String nombre ) throws Exception{
        return dp.findByNombreExacto(nombre);
    }
     public Producto  buscarPorID(int id ) throws Exception{
        return dp.getProductoById(id);
    }
    
}
