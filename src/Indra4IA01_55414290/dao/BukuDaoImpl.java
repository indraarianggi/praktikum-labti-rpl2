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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author suryaatmaja14290
 */
@Repository
public class BukuDaoImpl implements BukuDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void saveBuku(Buku buku) {
        sessionFactory.getCurrentSession().save(buku);
    }
    
    @Override
    public List<Buku> getDaftarBuku() {
        return sessionFactory.getCurrentSession()
                .createCriteria(Buku.class)
                .list();
    }
    
    @Override
    public void updateBuku(Buku buku) {
         sessionFactory.getCurrentSession().update(buku);
    }
    
    @Override
    public void deleteBuku(Buku buku) {
        sessionFactory.getCurrentSession().delete(buku);
    }
    
}
