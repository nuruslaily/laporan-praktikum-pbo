package frontend1841720049Nurus;

import backend1841720049Nurus.Buku1841720049Nurus;
import backend1841720049Nurus.Kategori1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class TestBackendBuku1841720049Nurus {
    public static void main(String[] args) {
        Kategori1841720049Nurus novel = new Kategori1841720049Nurus().getById(39);
        Kategori1841720049Nurus referensi = new Kategori1841720049Nurus().getById(40);

        Buku1841720049Nurus buku1 = new Buku1841720049Nurus(novel, "Dilan 1990", "PT.Mizan Pustaka", "Pidi Baiq");
        Buku1841720049Nurus buku2 = new Buku1841720049Nurus(novel, "Dilan 1991", "PT.Mizan Pustaka", "Pidi Baiq");
        Buku1841720049Nurus buku3 = new Buku1841720049Nurus(novel, "Milea", "PT.Mizan Pustaka", "Pidi Baiq");

        // test insert
        buku1.save();
        buku2.save();

        // test update
        buku2.setmJudul("Drunken Molen");
        buku2.save();

        // test delete
        buku3.delete();

        // test select all
        for(Buku1841720049Nurus b : new Buku1841720049Nurus().getAll())
        {
        System.out.println("Kategori: " + b.getmKategori().getmNama() + ", Judul: " + b.getmJudul());
        }

        // test search
        for(Buku1841720049Nurus b : new Buku1841720049Nurus().search("1991"))
        {
        System.out.println("Kategori: " + b.getmKategori().getmNama() + ", Judul: " + b.getmJudul());
        }
    }
}
