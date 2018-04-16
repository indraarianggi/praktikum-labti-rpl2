/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Indra4IA01_55414290.service;

import Indra4IA01_55414290.dao.BukuDao;
import Indra4IA01_55414290.model.Buku;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author indraarianggi
 */
@Service("BukuService") // memberi tahu Spring bahwa class ini adalah class service
@Transactional(readOnly = true)
public class BukuServiceImpl implements BukuService {

    @Autowired
    private BukuDao bukuDao;

    @Override
    @Transactional
    public void saveBuku(Buku buku) {
        bukuDao.saveBuku(buku);
    }

    @Override
    @Transactional
    public void updateBuku(Buku buku) {
        bukuDao.updateBuku(buku);
    }

    @Override
    @Transactional
    public void deleteBuku(Buku buku) {
        bukuDao.deleteBuku(buku);
    }

    @Override
    public List<Buku> getDaftarBuku() {
        return bukuDao.getDaftarBuku();
    }
    
}
