package dao;
import entidades.Cliente;
import java.util.ArrayList;
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
       session.close();
       return true;
    }
   
    public boolean updateCliente(Cliente cli)throws Exception{
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.update(cli);
        session.flush();
        tx.commit();
        session.close();
        return true;
    }
    
    public boolean deleteCliente(Cliente cli)throws Exception{
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.delete(cli);
        session.flush();
        tx.commit();
        session.close();
        return true;
    }
    
    
    public ArrayList<Cliente> getClientes()throws Exception {
       iniciaOperacion();
       Transaction tx = session.beginTransaction();
       ArrayList<Cliente> cli = (ArrayList<Cliente>) session.createQuery("From Cliente").list();
       session.flush();
       tx.commit();
       session.close();
       return cli;
   }
    
    public ArrayList<Cliente> getClienteById(int id_cliente)throws Exception {
       iniciaOperacion();
       Transaction tx = session.beginTransaction();
       ArrayList<Cliente> cli = (ArrayList<Cliente>) session.createQuery("From Cliente cli where cli.id_cliente="+id_cliente).list();
       session.flush();
       tx.commit();
       session.close();
       return cli;
   }
  
}
