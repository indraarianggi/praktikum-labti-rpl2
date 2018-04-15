/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Indra4IA01_55414290.dao;

/**
 *
 * @author suryaatmaja14290
 */
import Indra4IA01_55414290.model.Buku;
import java.util.List;

public interface BukuDao {
    public void saveBuku(Buku buku);
    public void updateBuku(Buku buku);
    public void deleteBuku(Buku buku);
    public List<Buku> getDaftarBuku();
}
