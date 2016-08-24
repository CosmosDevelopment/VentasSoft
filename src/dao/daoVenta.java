package dao;
import entidades.Venta;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author Gabriel
 */
public class daoVenta {
    private static Session session;
    private static SessionFactory sf;
    
    private static void iniciaOperacion()throws Exception {
        if(session==null){
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
        }
    }
    
    public boolean insertVenta(Venta venta)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.save(venta);
        session.flush();
        tx.commit();
        return true;
    }
    
    public boolean updateVenta(Venta venta)throws Exception{
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.update(venta);
        session.flush();
        tx.commit();
        return true;
    }
    
    public boolean deleteVenta(Venta venta)throws Exception{
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.delete(venta);
        session.flush();
        tx.commit();
        return true;
    }
    
    
    public ArrayList<Venta> getVentas()throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        ArrayList<Venta> venta = (ArrayList<Venta>) session.createQuery("From Venta").list();
        session.flush();
        tx.commit();
        return venta;
    }
    
    public ArrayList<Venta> getVentasById(int id_venta)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        ArrayList<Venta> venta = (ArrayList<Venta>) session.createQuery("From Producto pro where pro.id_producto="+id_venta).list();
        session.flush();
        tx.commit();
        return venta;
    }
    
    public ArrayList<Venta> getVentasByIdCliente(int idCliente)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        Query query= session.createQuery("From Venta v where v.cliente.idCliente=:idCliente");
        query.setParameter("idCliente",idCliente);
        ArrayList<Venta> venta = (ArrayList<Venta>) query.list();
        session.flush();
        tx.commit();
        return venta;
    }
}
