/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Indra4IA01_55414290.config;

/**
 *
 * @author suryaatmaja14290
 */
import Indra4IA01_55414290.dao.BukuDao;
import Indra4IA01_55414290.dao.BukuDaoImpl;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    
    private static final SessionFactory SESSION_FACTORY;
    private static final BukuDao BUKU_DAO;
    
    static {
        try {
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
            BUKU_DAO = new BukuDaoImpl(SESSION_FACTORY);
        } catch(HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed." +ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY;
    }
    
    public static BukuDao getBukuDao() {
        return BUKU_DAO;
    }
    
}
