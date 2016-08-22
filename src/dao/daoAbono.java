package dao;
import entidades.Abono;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
/**
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
    
    public ArrayList<Abono> getAbonoById(int id_abono)throws Exception {
       iniciaOperacion();
       Transaction tx = session.beginTransaction();
       ArrayList<Abono> abono = (ArrayList<Abono>) session.createQuery("From Abono abo where abo.id_abono="+id_abono).list();
       session.flush();
       tx.commit();
       return abono;
   }
   


    
}
