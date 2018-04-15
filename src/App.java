
import Indra4IA01_55414290.model.Buku;
import Indra4IA01_55414290.model.Majalah;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryaatmaja14290
 */
public class App {
    public static void main(String[] args) {
        
        Buku buku = new Buku();
        Majalah majalah = new Majalah();
        
        buku.setJudul("Belajar Untuk Lulus");
        buku.setPenulis("Arianggi");
        
        majalah.setJudul("Play Ground");
        majalah.setEdisi("November");
        
        System.out.println("Judul buku: " + buku.getJudul());
        System.out.println("Judul majalah edisi " + majalah.getEdisi() + ": " + majalah.getJudul());
    }
}
