package dao;
import entidades.Cliente;
import entidades.Producto;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author Gabriel Matamala
 */
public class daoCliente {
    private static Session session;
    private static SessionFactory sf;
    
    private static void iniciaOperacion()throws Exception {
        if(session==null){
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
        }
    }
    
    public boolean insertCliente(Cliente  cli)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.save(cli);
        session.flush();
        tx.commit();
        return true;
    }
    
    public boolean updateCliente(Cliente cli)throws Exception{
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.update(cli);
        session.flush();
        tx.commit();
        return true;
    }
    
    public boolean deleteCliente(Cliente cli)throws Exception{
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.delete(cli);
        session.flush();
        tx.commit();
        return true;
    }
    
    
    public ArrayList<Cliente> getClientes()throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        ArrayList<Cliente> cli = (ArrayList<Cliente>) session.createQuery("From Cliente").list();
        session.flush();
        tx.commit();
        return cli;
    }
    
    public ArrayList<Cliente> getClienteById(int id_cliente)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        ArrayList<Cliente> cli = (ArrayList<Cliente>) session.createQuery("From Cliente cli where cli.id_cliente="+id_cliente).list();
        session.flush();
        tx.commit();
        return cli;
    }
    
    
    public ArrayList<Cliente> findByBusqueda(int busqueda,String dato)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        Query  query;
        ArrayList<Cliente> cli= new ArrayList<Cliente>();
        switch(busqueda){
            
            case 0:
                query= session.createQuery("From Cliente c where c.rutCliente like :dato ");
                query.setParameter("dato",  "%" + dato + "%");
                cli = (ArrayList<Cliente>) query.list();
                session.flush();
                tx.commit();
                return cli;
                
            case 1:
                
                query = session.createQuery("From Cliente c where c.nombreCliente like :dato ");
                query.setParameter("dato",  "%" + dato + "%");
                cli= (ArrayList<Cliente>) query.list();
                session.flush();
                tx.commit();
                return cli;
                
            case 2:
                query= session.createQuery("From Cliente c where c.apellidoCliente like :dato ");
                query.setParameter("dato",  "%" + dato + "%");
                cli = (ArrayList<Cliente>) query.list();
                session.flush();
                tx.commit();
                return cli;
            case 3:
                query= session.createQuery("From Cliente c where c.numeroCliente = :dato ");
                query.setParameter("dato",   Integer.parseInt(dato) );
                cli = (ArrayList<Cliente>) query.list();
                session.flush();
                tx.commit();
                return cli;
        }
        return cli;
    }
    
    
    
    
    
}
