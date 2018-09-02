package dao;
import entidades.Abono;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 * /**
 *
 * @author Gabriel
 */
public class daoAbono {
    private static Session session;
    private static SessionFactory sf;
    
    private static void iniciaOperacion()throws Exception {
        if(session==null){
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
        }
    }
    
    public boolean insertAbono(Abono  abono)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.save(abono);
        session.flush();
        tx.commit();
        return true;
    }
    
    public boolean updateAbono(Abono abono)throws Exception{
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.update(abono);
        session.flush();
        tx.commit();
        return true;
    }
    
    public boolean deleteAbono(Abono abono)throws Exception{
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        session.delete(abono);
        session.flush();
        tx.commit();
        return true;
    }
    
    
    public ArrayList<Abono> listAbono()throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        ArrayList<Abono> abono = (ArrayList<Abono>) session.createQuery("From Abono").list();
        session.flush();
        tx.commit();
        return abono;
    }
    
    public Abono getAbonoById(String idAbono)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();               
        Query query= session.createQuery("From Abono ab where ab.idAbono=:idAbono");
        query.setParameter("idAbono",  Integer.parseInt(idAbono) );
        Abono ab = (Abono) query.uniqueResult();
        session.flush();
        tx.commit();
        return ab;
        
    }
    
    public ArrayList<Abono> getAbonoByIdCliente(int idCliente)throws Exception {
        iniciaOperacion();
        Transaction tx = session.beginTransaction();
        Query query=session.createQuery("From Abono abo where abo.cliente.idCliente=:idCliente");
        query.setParameter("idCliente", idCliente);
        ArrayList<Abono> abono = (ArrayList<Abono>) query.list();
        session.flush();
        tx.commit();
        return abono;
    }
    
    
}
