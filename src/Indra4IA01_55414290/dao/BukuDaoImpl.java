/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Indra4IA01_55414290.dao;

import Indra4IA01_55414290.model.Buku;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author suryaatmaja14290
 */
public class BukuDaoImpl implements BukuDao {
    
    private final SessionFactory sessionFactory;
    
    public BukuDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void saveBuku(Buku buku) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(buku);
            session.getTransaction().commit();
        } catch(Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
    
    @Override
    public List<Buku> getDaftarBuku() {
        Session session = sessionFactory.openSession();
        
        try {
            session.beginTransaction();
            List<Buku> daftarBuku;
            daftarBuku = session.createCriteria(Buku.class).list();
            session.getTransaction().commit();
            return daftarBuku;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
    
    @Override
    public void updateBuku(Buku buku) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(buku);
            session.getTransaction().commit();
        } catch(Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
    
    @Override
    public void deleteBuku(Buku buku) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.delete(buku);
            session.getTransaction().commit();
        } catch(Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
    
}
