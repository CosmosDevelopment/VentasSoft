package dao;
import entidades.Producto;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Gabriel
 */
public class daoProducto {
    private static Session session;
    private static SessionFactory sf;
    
    private static void iniciaOperacion()throws Exception {
        if(session==null){
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
        }
    }
    
    public boolean insertProducto(Producto pro)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.save(pro);
        session.flush();
        tx.commit();
        return true;
    }
    
    public boolean updateProducto(Producto pro)throws Exception{
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.update(pro);
        session.flush();
        tx.commit();
        return true;
    }
    
    public boolean deleteProducto(Producto pro)throws Exception{
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.delete(pro);
        session.flush();
        tx.commit();
        return true;
    }
    
    
    public ArrayList<Producto> listProductos()throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        ArrayList<Producto> pro = (ArrayList<Producto>) session.createQuery("From Producto").list();
        session.flush();
        tx.commit();
        return pro;
    }
    
    public ArrayList<Producto> findByNombreProducto(String nombre)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        Query query= session.createQuery("From Producto p where p.nombreProducto like :nombre ");
        query.setParameter("nombre",  "%" + nombre + "%");
        ArrayList<Producto> pro = (ArrayList<Producto>) query.list();
        session.flush();
        tx.commit();
        return pro;
    }
    
      public Producto findByNombreExacto(String nombre)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        Query query= session.createQuery("From Producto p where p.nombreProducto =:nombre ");
        query.setParameter("nombre",  nombre );
        Producto pro = (Producto) query.uniqueResult();
        session.flush();
        tx.commit();
        return pro;
    }
    
    public Producto getProductoById(int idProducto)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        Query query=session.createQuery("From Producto pro where pro.idProducto =:idProducto");
        query.setParameter("idProducto",  idProducto );
        Producto pro = (Producto) query.uniqueResult();
        session.flush();
        tx.commit();
        return pro;
    }
    
    
}
