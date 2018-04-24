/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Indra4IA01_55414290.controller;

import Indra4IA01_55414290.app.App;
import Indra4IA01_55414290.config.BukuTableModel;
import Indra4IA01_55414290.dao.BukuDao;
import Indra4IA01_55414290.model.Buku;
import Indra4IA01_55414290.view.BukuView;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author suryaatmaja14290
 */
public class BukuController {
    
    private final BukuView bukuView;
    private BukuTableModel bukuTableModel;
    private List<Buku> daftarBuku;
    
    public BukuController(BukuView bukuView) {
        this.bukuView = bukuView;
    }
    
    public void tampilData() {
        daftarBuku = App.getBukuService().getDaftarBuku();
        bukuTableModel = new BukuTableModel(daftarBuku);
        this.bukuView.getTblBuku().setModel(bukuTableModel);
    }
    
    public void simpanBuku() {
        Buku buku = new Buku();
        
        buku.setIsbn(this.bukuView.getTxtIsbn().getText());
        buku.setJudul(this.bukuView.getTxtJudul().getText());
        buku.setPenulis(this.bukuView.getTxtPenulis().getText());
        buku.setPenerbit(this.bukuView.getTxtPenerbit().getText());
        buku.setTahun(Integer.parseInt(this.bukuView.getTxtTahun().getText()));
        buku.setHarga(Float.parseFloat(this.bukuView.getTxtHarga().getText()));
        
        App.getBukuService().saveBuku(buku);
        
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Info",
                JOptionPane.INFORMATION_MESSAGE);
        tampilData();
    }
    
    public void updateBuku() {
        Buku buku = new Buku();
        
        buku.setIsbn(this.bukuView.getTxtIsbn().getText());
        buku.setJudul(this.bukuView.getTxtJudul().getText());
        buku.setPenulis(this.bukuView.getTxtPenulis().getText());
        buku.setPenerbit(this.bukuView.getTxtPenerbit().getText());
        buku.setTahun(Integer.parseInt(this.bukuView.getTxtTahun().getText()));
        buku.setHarga(Float.parseFloat(this.bukuView.getTxtHarga().getText()));
        
        App.getBukuService().updateBuku(buku);
        
        JOptionPane.showMessageDialog(null, "Data berhasil diupdate", "Info",
                JOptionPane.INFORMATION_MESSAGE);
        tampilData();
    }
    
    public void cekbuku() {
        int index =  this.bukuView.getTblBuku().getSelectedRow();
        
        this.bukuView.getTxtIsbn().setText(
                String.valueOf(this.bukuView.getTblBuku()
                        .getValueAt(index, 0))
        );
        
        this.bukuView.getTxtJudul().setText(
                String.valueOf(this.bukuView.getTblBuku()
                        .getValueAt(index, 1))
        );
        
        this.bukuView.getTxtPenulis().setText(
                String.valueOf(this.bukuView.getTblBuku()
                        .getValueAt(index, 2))
        );
        
        this.bukuView.getTxtPenerbit().setText(
                String.valueOf(this.bukuView.getTblBuku()
                        .getValueAt(index, 3))
        );
        
        this.bukuView.getTxtTahun().setText(
                String.valueOf(this.bukuView.getTblBuku()
                        .getValueAt(index, 4))
        );
        
        this.bukuView.getTxtHarga().setText(
                String.valueOf(this.bukuView.getTblBuku()
                        .getValueAt(index, 5))
        );
        
    }
    
    public void deleteBuku() {
        Buku buku = new Buku();
        
        buku.setIsbn(this.bukuView.getTxtIsbn().getText());
        buku.setJudul(this.bukuView.getTxtJudul().getText());
        buku.setPenulis(this.bukuView.getTxtPenulis().getText());
        buku.setPenerbit(this.bukuView.getTxtPenerbit().getText());
        buku.setTahun(Integer.parseInt(this.bukuView.getTxtTahun().getText()));
        buku.setHarga(Float.parseFloat(this.bukuView.getTxtHarga().getText()));
        
        App.getBukuService().deleteBuku(buku);
        
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Info",
                JOptionPane.INFORMATION_MESSAGE);
        tampilData();
    }
    
}
